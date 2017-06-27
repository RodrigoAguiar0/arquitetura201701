<img src="complemento_modulos.png">

O diagrama acima trata-se de uma arquitetura orientada a microserviços, de tal forma que cada microserviço tenha sua responsabilidade em disponibilizar os dados, atendendo os requisitos de qualidade.

## Cliente
O módulo cliente engloba as camadas fábrica, UI Views (User Interface), models e controllers.
A parte de fábrica funciona de forma genérica, atuando do redirecionamento de aplicações de acordo com a funcionalidade exigida pelo usuário. Um exemplo disso, seria a parte de agendamento, o qual é reponspavel por realizar o agendamento das consultas, de tal forma que, ocorra a disponibilização de uma interface gráfica para a realização das seguintes operações:
- Cadastro de consulta
- Confirmação de consulta
- Notificação de data de retorno para pacientes.
- Consultar dados dos pacientes como endereço, email, whatsapp, skype, etc.

UI Views contém o front-end referente a parte de agendamento, paciente, atenção à saúde, Recursos Humanos, estoque e Financeiro e Faturamento.

Models contém a parte de regra de negócio das Views de serão geradas pela fábrica genérica, ou seja, em models haverá toda a estrutura de atributos de acordo com a view específica.

Controllers contém os métodos responsáveis tanto por delegar ações (Actions), para classes controladoras posteriores, quanto por realizar requisições http de acordo com os dados inseridos nos formulários das views que estão em UI Views.

## API Gateway

De acordo com definições da Amazon API Gateway, podemos entender que é um serviço que permite o desenvolver criar, monitorar e manter a API em qualquer escala, funcionando como uma porta de conexão de acesso à dados externos.

Fonte: https://aws.amazon.com/pt/api-gateway/ Acesso em 26 de Jun. 2017. 

### Atenção à Saúde
<img src="especificacao_atencaosaude.png">
