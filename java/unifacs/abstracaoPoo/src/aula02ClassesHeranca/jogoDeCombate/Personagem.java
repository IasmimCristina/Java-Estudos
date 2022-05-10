package aula02ClassesHeranca.jogoDeCombate;

public class Personagem implements InterfaceDoPersonagem {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Personagem(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); //Detalhe
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    @Override
    public void apresentar() {

    }

    @Override
    public void status() {

    }

    @Override
    public void ganharLuta() {

    }

    @Override
    public void perderLuta() {

    }

    @Override
    public void empatarLuta() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            categoria = "Leve";
        } else if (this.peso <= 83.9) {
            categoria = "Médio";
        } else if (this.peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido"; //Parei no vídeo 07a no tempo 23 minutos.
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

