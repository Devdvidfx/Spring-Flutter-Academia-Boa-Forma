### Aqui é um guia e melhorias pro back-end

#### Arquivo **alunoModel**

Dentro do model esta a para do banco de dados. Tem pontos onde não precisam ir ao banco de dados e criando certa logicas podem ser melhores. Pontos que acho que da para fazer isso:

    private String servicoEscolhido; 
    private String tipoPagamento;
    private String qualObjetivo;

- private String servicoEscolhido que o servico escolhido é Diaria ou mensalidade.
- private String tipoPagamento tem alguma varial vel como Pix, Credito, debito, dinheiro.
- private String qualObjetivo tem que averiguar com os professor quantos ojetivos de alunos existem.

Por isso estão comentados

Não coloquei todas as informações de alunos pois essa informações precisam ser pesanda como colocar as informaçõe são:

- Peso corporio
- Peso corporio ao longo dos meses
- Medidas
- Medidas ao longo dos meses
- Tempo de cardio
- Tempo de cardio ao longo dos meses