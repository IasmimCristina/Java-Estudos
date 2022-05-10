package MetodosAbstratos;

public class AlunoPosGraduacao {
    private double notaPosGraduacao;

    public double getNotaPosGraduacao() {
        return notaPosGraduacao;
    }

    public void imprimirNotaNaoG(){
        System.out.println("Nota de um estudante de graduação!");
    }

    public void setNotaPosGraduacao(double notaPosGraduacao) {
        this.notaPosGraduacao = notaPosGraduacao;
    }
}
