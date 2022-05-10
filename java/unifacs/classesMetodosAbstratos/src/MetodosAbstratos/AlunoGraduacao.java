package MetodosAbstratos;

public class AlunoGraduacao extends Aluno {
    private double notaGraducao;

    public double getNotaGraducao() {
        return notaGraducao;
    }

    public void imprimirNotaG(){
        System.out.println("Nota de um estudante de graduação!");
    }

    public void setNotaGraducao(double notaGraducao) {
        this.notaGraducao = notaGraducao;
    }

    public AlunoGraduacao(String nome, String matricula) {
        super(nome, matricula);
    }
}
