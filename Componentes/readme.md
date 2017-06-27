

### Diagrama de Componentes | Especificação Atenção a Saúde
<img src="componente_atencaoasaude.png"/>

O diagrama de componentes acima explica que em uma máquina virtual estarão rodando os componentes referentes ao microserviço de atenção a saúde, o SGBD do banco de dados oracle e o componente do springBoot que faz o acesso contínuo dos dados no componente ORACLE.

De acordo com os requisitos funcionais, faz-se necessário a comunicação com serviço externo, os quais são representados pelos componentes de CID-10 e CID-0, que estão o tempo todo escutando requisições.

O componente RabbitMQ é um servidor ativo para trocar de mensagem em sistemas, de tal forma que exista um produtor da mensagem e um receptor e vice-versa. Já o OAuth, servirá como um interceptador e validador das mensagens enviadas de todos os lados, promovendo assim a segurança dos dados que são trafegados pelo microserviços, juntamente com o OAuth que fará a verificação de usuário que requisita dados e se os parâmetros enviados são os esperados. Caso não seja parâmetro esperado, o OAuth apenas retornará para o fluxo de execução inicial e ficará pronto para validar as próximas requisições.

### Diagrama de Componentes | Especificação Agendamento

<img src="ComponentesAgendamento.png" />
