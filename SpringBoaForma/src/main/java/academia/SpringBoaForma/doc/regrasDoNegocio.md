# Regras Gestor 

#### Como funciona o nivel de acessos?

Como tem multiplos usarios cada um deve ter uma cadama de acesso para vizualizar cada parte como é posivel ver no link do figman: https://encr.pw/A2LKR.
Dessa maneira sendo:

- Pefil **MASTER** ( Acesso a tudo sendo interno da TI e so a TI pode ver )
- Gestor ( Podendo ver tudo sobre gestão de pessoas e possibilidade de editar os professores e os alunos )
- Professor ( Podem mudar algumas coisas do aluno como doenças, treinos e isso deve atualizar no gestor e no aluno)
- Os alunos so conseguem mexer no seu treino

Um exemplo disso é o gestor tendo o acesso ao perfil de aluna:

> Aluna: Rita Gomes

> Idade: 64 anos

> Doença: Arritimia do coração

> Exercio: Leg press com indação de peso 20kg

> Pagamento: Dinheiro 60,00 $

Nesse caso o professor so tem acesso de dados da aluna, idade, doenças, exercio. não ao valor pago mas os gestores tem esse acesso.
O professor pode atualizar informações como doenças no caso da aluna venha a desenvolver ao logo de sua vida e for informando.

>  Doença: Arritimia do coração, diabetes tipo 2

Um caso que todos podem ver um dado é caso se a Aluna chamada Rita Gomes trocar o peso e anotar o peso pelo o APP do exercicio.

> Data que foi passado: 01/01/2025

> Exercio: Leg press com indação de peso 20kg

Dona Rita trocou

> Data que foi passado: 01/01/2025

> Exercio: Leg press com indação de peso 400kg

> Data da alteração do peso recomedado: 22/01/2025

Essa troca de peso recomendado deve ficar salvo até a troca da ficha da aluna. Caso a aluna venha alegar que o professor passo um exercico X com uma carga muito alta a academia tem como provar que tal afirmação é falsa.
Essa troca de ficha ocorre pelo o periodo que o professor por.

### Configurações gestores

Deve ter uma pagina focada para configurações do gestor, onde ele pode alterar o preço, datas para eviar notificações para usarios "Professores e alunos", por padrão vindo somentes datas de feriados para eles. Aviso de promoções quando tiver.

### Registro de alunos novos e de professores novos:

Os gestores da academia querem fazer o registro. O registro deve ser feito pelo o gestor onde ele faz algumas perguntas para o aluno ou professor. Caso de aluno o professor consegue prencher os dados dos alunos. Caso de registro de professor não podem, professor não pode alterar dado de professor.

### Dados necessario paro o banco de dados dos alunos:

- Nome
- Data de nascimento 
- Data do registro 
- Numero telefonico  
- Numero telefonico de energencia
- Rua
- CPF
- Doença | " Verdadeiro ou Falso "
- Qual doença | " Campo depende se doença for verdadeiro "
- Qual objetivo
- Senha
- Data do pagamento
- Data de validade da mensalidade
- Plano escolhido
- Valor pago
- Tipo do pagamento
- Duração do pagamento
- Altura
- Peso corporio
- Peso corporio ao longo dos meses
- Medidas
- Medidas ao longo dos meses
- Tempo de cardio
- Tempo de cardio ao longo dos meses
- Acesso aluno ao sistema | " Verdadeiro ou Falso "

### Logica dos dados de alunos

- Nome
> Não é necessario o nome completo. Mas caso a pessoa der o nome completo deve ser registrado.

- Data de nascimento
> Para registro da idade. Sendo previso criação de API para atualizar a idade de acordo com o calendario. Outra API para mensagem de parabens.

- Data do registro
> Pegue pelo o calendario o dia que foi feito o resgistro do aluno

- Numero telefonico
> O numero de WPP para que seja possivel um contato.

- Numero telefonico de energencia
> Contato para caso o aluno venha passar mal seja possivel entrar em contato com alguem.

- Rua
> Localização da moradia de aluno. Sendo possivel vizualiar de qual região tem mais alunos.

- CPF
> Indeficador unico de pessoas caso venha ser utilizado contrato é bom ter esse valor salvo.

- Doença | " Verdadeiro ou Falso "
> Verificando se tem alguma doença que possa inpedir de treinar ou tenha que ter um cuidado extra com o aluno.

- Qual doença | " Campo depende se doença for verdadeiro "
> Descrição da doença.

- Qual objetivo
> Como cada aluno tem um objetivo diferente é bom ter anotado para que o professor consiga ajudar nesse objetivo.
> tabem ajuda na criação da parte de evolução do aluno.

- Senha
> Sendo necessario para o login.

- Data do pagamento
> Como alguns alunos esquecem de pagar no dia devido, eles pagam em outras datas. Isso deve ser registrado para um melhor controle dos gestores.

- Data de validade da mensalidade
> A data correta do vencimento da mensalidade. O gestor considera uma data diferente da data de pagamento, como dito acima. assim sabe o real dia de pagamento de um aluno.

- Plano escolhido
> Se foi mensalidade ou diaria. Mesmo raramente se trabalhando com diarias é um dado interesante de ser registrado. De padrão deve vim mensalidade.

- Tipo do pagamento
> Como foi pago, Dinheiro, PIX, Cartão debito ou credito.

- Duração do pagamento
> A real validade da mensalidade considerando o dia pagado.

- Altura
> Altura do aluno

- Peso corporio
> Peso do aluno inicial do aluno ou peso atual.

- Peso corporio ao longo dos meses
> Marcação de peso durante os meses. Para uma vizualização de sua progressão.

- Medidas
> As medidas são tamanho do braço, cintura e etc. Para uma vizualização de sua progressão.

- Medidas ao longo dos meses
> Marcação dos tamanhos de braços e outros ao longo dos meses. Para uma vizualização de sua progressão.

- Tempo de cardio
> O tempo inicial ou atual de quantos minutos fica fazendo cardio.

- Tempo de cardio ao longo dos meses
> Marcação de tempo de cardio ao longos do meses.

- Acesso aluno ao sistema
> Se o aluno é autorizado pelos os gestores a usar o aplicativo.

### Quais campos são preciso na hora do registro? 

O registro é feito no balcão da academia pelos os gestores, dessa forma tem campos que vão ser necessario na hora do registro que precisão ser prenchidos.
Para o registro na hora do aluno os campos que tiver ( NPR ) que é Necessario Para Registro, são os valores que são preciso na hora do registro do aluno sendo necessario para que possa se fazer o registro.
Os campos com ( OPR ) é Opcional para o registro, com informações que pode vim depois e não afetando na hora do registro.
Campos com " ??? " é que deve ser debatidos com os gestores.

- Nome ( NPR )
- Data de nascimento ( NPR )
- Data do registro ( NPR )
- Numero telefonico ( OPR )
- Numero telefonico de energencia ( NPR )
- Rua ( OPR )
- CPF ( OPR )
- Doença ( NPR )
- Qual doença ( NPR )
- Qual objetivo ( NPR )
- Senha ( NPR )
- Data do pagamento ( NPR )
- Data de validade da mensalidade ( NPR )
- Plano escolhido ( NPR )
- Tipo do pagamento ( NPR )
- Duração do pagamento ( NPR )
- Altura ( OPR )
- Peso corporio ( OPR )
- Peso corporio ao longo dos meses ( OPR )
- Medidas ( OPR )
- Medidas ao longo dos meses ( OPR )
- Tempo de cardio ( OPR )
- Tempo de cardio ao longo dos meses ( OPR )
- Acesso aluno ao sistema ( NPR )

Alguns campos é bom fazer APIs para que ppossam ser dinamicas para os gestores.
Esses campos vão ser explicados melhor a baixos.

### APIs para agilidade dos gestores

No momento tendo uma gestora chamada Gorete. A gorete é uma senhora de certa idade e leiga em tecnologia. 
De maneira onde temos que facilitar ao maximo sua vida.

Para um melhor entendimento vou pegar o dado do banco de dados que foi citatado acima e fazendo explicação do que deve ser feito com ele e seu resultado esperado.

- Data de nascimento
> Com a data de nascimento deve ser feito uma logica para que faça a idade do aluno somente com a sua data de nascmento.

- Data do pagamento 
> A data de pagamento é o dia que foi pago, precisando da forma de pagamento e o valor pago.

> A data de pagamento é diferente da data da mensalidade. Com alguns alunos não pagam no dia demorando para pagar, precisamos marca esse tempo que ela perde esse dinheiro.

- Data de validade da mensalidade
> Precisa pegar a data da mensalidade fazer um calculo para que seja feito uma duração da mensalidade do aluno.

> Não se considera o pagamento.

> Pode ser pegue o acesso dado pelo o gestor no dia e fazer o calculo

- Acesso aluno ao sistema
> O aluno deve ser liberado pelo o gestor.

> Caso passe o valor do Data de " validade da mensalidade " e um tempo de cinco dias do vencimento deve ser bloqueado.

> Quando vence e entra no cincos ultimos dias deve ficar em aviso para travar e o gestor podendo ver isso.

### Dentro da logica de registro dos alunos:

Com as coletas dos dados vamos fazer a senha.
Os gestores não devem ter acesso a senha do aluno, para evitar isso o gestor deve pegar os dados dos obrigatiros para a criação. Sendo o User para login o nome e a senha uma senha padrão.

> User: alunoBoaForma

> Senha: BoaForma2025

Logo apois colocar os dados corretos, deve aparecer duas caixas de senha para alterar a senha.

> Nova Senha: AlunoDoBundão

> Confirma a senha: AlunoDoBundão

Com isso tendo uma alteração na senha para ser a senha padrão do gestor, professor, ou aluno. So mudando o alunoBoaForma para o cargo que corresponde.

### Dentro da logica de acesso dos alunos.

- Como dito os alunos não pagam em no dia que devem dando prejuizo isso deve ser informado para que tem uma noção da perca de dinheirio.


- Tolerancia de cinco dias caso de vença o mensalidade.


- Para retorna o acesso do aluno é manual feito pelo gestor


- Sistemas de cores na visão do gestor sendo azul ou verde para dentro da validade da mensalidade, amarelo para o periodo de cinco dias antes de vencer, amarelo escuro no periodo da tolerancia e vermelho caso esta vencido.


### Dentro da logica de registro dos estagiarios:

- Nome completo 
- CPF 
- Data de nascimento 
- Data do registro 
- Sexo 
- Endereço completo 
- E-mail 
- Numero telefonico 
- Contato de energencia 
- Foto 
- Instituição de formação 
- Data estimada de termino do curso 
- Historio academico 
- Comprovante de matricula 
- Turno do estagio ( manhã, tarde ou noite ) 
- Duração do estagio 

### Dentro da logica de registro dos professores:

- Nome completo |
- CPF |
- Data de nascimento |
- Sexo |
- Estado Civil |
- Endereço completo |
- E-mail |
- Numero telefonico |
- Contato de energencia |
- Foto |
- Área de atuação ( Musculação, yoga, etc... ) |
- Numero do CREF |
- Instituição de formação |
- Supervisor do estagio |

Com as coletas dos dados vamos fazer a senha.
Os gestores não devem ter acesso a senha do professor, para evitar isso o gestor deve pegar os dados dos obrigatiros para a criação. Sendo o User para login o nome e a senha uma senha padrão.

> User: ProfessorBoaForma

> Senha: BoaForma2025

Logo apois colocar os dados corretos, deve aparecer duas caixas de senha para alterar a senha.

> Nova Senha: professorDoBundão

> Confirma a senha: professorDoBundão

Com isso tendo uma alteração na senha para ser a senha padrão do gestor, professor, ou aluno. So mudando o professorBoaForma para o cargo que corresponde.

### O que fazemos caso alguem esqueça a senha?

Na tela dos gestores, vai ter uma opção para gerir aluno ou professor. Ao clicar em um dos dois e clicar no individo que esqueceu a senha, deve ter una opção de restaurar a senha padrão. Como:

> Login: professorPerdeuSenha

> Senha esquecida: Pudim2025!

Ao clicar para resetar a senha a senha dele volta.

> Login: professorPerdeuSenha

> Senha esquecida: BoaForma2025

### Como funciona a gestão de um aluno?

Deve conseguir editar as informações de uma forma rapida e pratica.
Deve colocar o valor pago, a forma de pagamento e a duração da mensalidade.
O valor pago deve tem uma opção a mais de configuaração dentro das opções do gestor para alterar o valor.

Ex:

> Começo da mensalidade: 02/01/2025

> Vencimento da mensalidade: 03/02/2025

> Data do pagamento: 08/01/2025

> Metado de pagamento: PIX

> Valor pago: 60$

Caso seja precisa alterar ela deve alterar alguma informação deve ser facil essa alteração.

### Como funciona a vizualização dos dados de alunos?

É bem simples, dentro da tela dos gestores tem que ter uma opção para vizualizar dados.
Ao clicar deve abriu um **POWER BI** com os dados dos alunos. Dentro desse POWER BI deve conter duas abas, uma aba de gestão de aluno como valores, pagamentos e afins e uma de evolução do aluno com o seu objetivo.

### Como funciona a vizualização dos dados de professor?

