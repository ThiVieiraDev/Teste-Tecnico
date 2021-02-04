package Exercicio2;

//Classe Livro herdando de Produto
public class Livro extends Produto implements Imposto{
    //Atributos da classe Livro
    private String autor;
    private String tema;
    private int qtdPag;

    // Construtores
    public Livro() {
    }
    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    //Getters and Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }
    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    // Método herdado da interface Imposto
    @Override
    public double calculaImposto() {
        if (tema == "educativo"){
            return 0;
        }
        else {
            return super.getPreco() + (super.getPreco() * 0.1);
        }
    }
}
