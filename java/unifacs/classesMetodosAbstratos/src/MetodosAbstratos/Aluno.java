package MetodosAbstratos;

public abstract class Aluno  implements Pessoa{
    protected String nome;
    protected String matricula;

    protected Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    protected void matricular() {
    System.out.println("Foi efetuada a matrícula!");
    }
}
