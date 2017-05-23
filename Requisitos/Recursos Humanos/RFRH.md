## R6 Requisitos Funcionais Recursos Humanos
	### Breve descrição
		Os requisitos funcionais fazem a descrição do processamento a ser realizado pelo sistema, através do detalhamento das entradas, saídas e dos dados que devem ser armazenados nesse sistema.
		
	### RF01 Fornecer opção de cadastro de corpo clínico
		 - Descrição: O sistema deve permitir o cadastro de dados de médicos que atuarão em diversos segmentos da área odontológica.
		 - Entrada: Nome, data de nascimento, número do conselho, CPF, estado civil, endereço, complemento, bairro, CEP, cidade, UF, telefone celular. 
		 - Processo: O cadastro será inserido em uma base de dados específica para informações de recursos humanos do SISB. 
		 - Saída: Mensagem de confirmação, bem sucedido do cadastro caso tenha sido efetuado com sucesso, senão, mensagem de erro.
		 - Atores: Administradores e usuários
		 - Prioridade: Essencial (X) Importante () Desejável () 
		 
	### RF02 Permitir sincronizar base de dados com informações fornecidas pelo BSUS
		 - Descrição: O sistema deve permitir a opção de consumir o serviço do BSUS de forma que obtenha informações dos médicos da área odontológica.
		 - Entrada: Nenhuma, apenas clique no botão sincronizar dados Barramento SUS
		 - Processo: Consumir serviço do barramento SUS
		 - Saída: Mensagem de confirmação, bem sucedido da requisição caso tenha sido efetuado com sucesso, senão, mensagem de erro. 
		 - Atores: Administradores e usuários
		 - Prioridade: Essencial  () Importante (X) Desejável () 
	
	### RF03 Fornecer opção que permite a comunicação interna entre os colaboradores através de chat online.
		 - Descrição: Deve-se fornecer um ícone de chat no layout do sistema para que os colaboradores comuniquem entre si.
		 - Entrada: Login e senha somente quando a sessão do usuário expirar.
		 - Processo: O sistema verifica se a sessão de usuário ainda está ativa, caso não esteja, o sistema obriga o usuário a logar novamente para utilizar o chat interno.
		 - Saída: Mensagem de boas vindas.
		 - Atores: Administradores e usuários
		 - Prioridade: Essencial (X) Importante () Desejável ()

	### RF04 Permitir o registro de chegada e de saída de um colaborador.
		 - Descrição: O sistema deve registrar os horários em que um funcionário chega e sai da empresa
		 - Entrada: Biometria do colaborador
		 - Processo: O sistema verifica se o usuário é cadastrado, e se os dados a serem enviados são válidos (ativo ou inativo), se for válido será apresentado mensagem de sucesso ou inconsistência na leitura da biometria.
		 - Saída: Mensagem de confirmação, bem sucedido ou de erro.
		 - Atores: Administradores e usuários
		 - Prioridade: Essencial (X) Importante () Desejável () 
		 
	### RF05 Exibir consulta de banco de horas de médicos odontólogos
		 - Descrição: O sistema deve permitir a abertura de uma tela de consulta para verificar quais médicos possuem mais horas trabalhadas durante um intervalo de tempo.
		 - Entrada: CRM do médico, quantidade de horas, data início, data fim.
		 - Processo: O sistema busca no banco de dados quais médicos possui uma quantidade X de horas trabalhadas durante o início e fim de uma data. A quantidade de horas trabalhadas e os intervalos são definidos pelo operador do sistema.
		 - Saída: Informações de horas trabalhadas a partir de uma data início e uma data fim de um determinado médico.
		 - Atores: Administradores.
		 - Prioridade: Essencial (X) Importante () Desejável ()
		 
	### RF06 Consultar avaliação de um médico.
		 - Descrição: O sistema deve permitir requisitar dados correspondente a avaliação de um paciente para com o médico.
		 - Entrada: Área de atuação do odontólogo,  ou nome do médico, ou CRM, ou apenas clique no botão consultar.
		 - Processo: O sistema verifica a base de dados, capturando a coluna que armazena a informação de avaliação de um médico. A base de dados é populada por informações advindas de serviços externos.
		 - Saída: Dados de avaliação do médico.
		 - Atores: Administradores
		 - Prioridade: Essencial (X) Importante () Desejável () 
	
	### RF07 Exibir a comparação de um médico mais bem avaliado, top 10 de médicos recomendados.
		 - Descrição: O sistema deve informar na sua estrutura de layout, uma lista dos 10 melhores médicos que foram bem avaliados pela comunidade atendida.
		 - Entrada: Nenhuma
		 - Processo: Após uma busca no banco de dados o sistema compara as avaliações e ordena a lista em ordem decrescente, exibindo para o usuário do sistema. 
		 - Saída: Lista com o nome dos 10 melhores médicos.
		 - Atores: usuários
		 - Prioridade: Essencial (X) Importante () Desejável ()
