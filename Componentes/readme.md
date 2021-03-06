

## Especificação Atenção a Saúde
<img src="componente_atencaoasaude.png"/>

O diagrama de componentes acima explica que em uma máquina virtual estarão rodando os componentes referentes ao microserviço de atenção a saúde, o SGBD do banco de dados Oracle e o componente do springBoot que faz o acesso contínuo dos dados no componente ORACLE.

De acordo com os requisitos funcionais, faz-se necessário a comunicação com serviço externo, os quais são representados pelos componentes de CID-10 e CID-0, que estão o tempo todo escutando requisições.

O componente RabbitMQ é um servidor ativo para trocar de mensagem em sistemas, de tal forma que exista um produtor da mensagem e um receptor e vice-versa. Já o OAuth, servirá como um interceptador e validador das mensagens enviadas de todos os lados, promovendo assim a segurança dos dados que são trafegados pelo microserviços, juntamente com o OAuth que fará a verificação de usuário que requisita dados e se os parâmetros enviados são os esperados. Caso não seja parâmetro esperado, o OAuth apenas retornará para o fluxo de execução inicial e ficará pronto para validar as próximas requisições.

## Especificação Agendamento

<img src="ComponentesAgendamento.png" />

O diagrama de componentes acima explica que em uma máquina genérica estarão rodando os componentes referentes ao microsserviço de agendamento, o SGBD do banco de dados Oracle e o componente SpringBoot, que oferece assistência para acesso contínuo dos dados no componente Oracle.

Os componentes referentes ao microsserviço de Agendamento especificados acima estão divididos por responsabilidade, sendo o componente Consultas (referente a quaisquer funcionalidades referentes a Agendamento de consultas, visualização de consultas, entre outros), Contatos (referente a quaisquer funcionalidades referentes a visualização de agenda de contatos, entre outros), ContatoSMS e ContatoEmail (fazem, respectivamente o papel de repasse de mensagens para os serviços externos de JavaMail, para envio de emails, e Twilio, para envio de mensagens SMS) e o grupo de componentes para comunicação com o banco de dados: SpringBoot (implementação de requisições), OAuth (Encriptação de dados) e Oracle (SGBD). Para comunicação entre microsserviços é usado um provedor de acesso, que implementa OAuth e fornece servidor RabbitMQ (Transmissor de mensagens de um microsserviço para outro).

## Especificação Financeiro e Faturamento

<img src="ComponenteFinanceiro.png" />

## Especificação Paciente

<img src="componente_paciente.png" />
- O componente execução de paciente representa o conjunto de tarefas que estão sendo feitas em tempo de requisição, tal como
a parte do gerenciador de retorno. Nesse componente, o paciente é gerido por API's que fazem comunicação com o barramento SUS,
obtendo informação do paciente. No entanto, ocorre a dependência de dados trafegados pelo gerenciador de espera, dado que o retorno
é feito a partir de dados fornecidos pela fila de espera, pois quando a fila diminui, isso indica que existem vagas para atendimento
de mais pacientes. O gerenciador de retornos, consume dados do barramento SUS utilizando tecnologia de autenticação OAuth e RabbitMQ para troca de mensagens
de ambos os lados. Tais componentes de execução encontram-se englobados pelo componente genérico: provedor de acesso (Responsável por obter dados complementares de pacientes).

O componente BDPaciente fica responsável por armazenar fotografias, anamneses clínicas e dados específicos do paciente. Nesse caso, optamos por utilizar um banco não relacional, 
pois ocorre armazenamento de dados de formulários. Assim sendo, o registro através no padrão "atributo: valor", promove a performance do microserviço de paciente, permitindo 
grandes volumes de requisições simultâneas.
