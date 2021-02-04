package Exercicio2;

import java.util.List;

// Classe Loja, como está no mesmo packjack é possível acessar as outras classes
public class Loja{
    // Atributos da Loja
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videosGames;

    // Construtores
    public Loja() {
    }
    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videosGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videosGames = videosGames;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideosGames() {
        return videosGames;
    }
    public void setVideosGames(List<VideoGame> videosGames) {
        this.videosGames = videosGames;
    }
    
    public void listaLivros(){
        if (livros.size() > 0){
            for (Livro total : livros){
                System.out.printf("Nome: %s %n Preço: %.0f %n Quantidade %d",total.getNome(), total.getPreco(), total.getQtd());
            }
        }
        else{
            System.out.println("A loja não tem livros no seu estoque");
        }
    }

    public void listaVideoGames(){
        if (videosGames.size() > 0){
            for (VideoGame total : videosGames){
                System.out.printf("Nome: %s %n Preço: %.0f %n Quantidade %d",total.getNome(), total.getPreco(), total.getQtd());
            }
        }
        else{
            System.out.println("A loja não tem livros no seu estoque");
        }
    }

    public double calculaPatrimonio() {
        double patrimonioTotal = 0;
        for(Livro total : livros) {
            patrimonioTotal += total.getPreco() * total.getQtd();
        }
        for(VideoGame total: videosGames) {
            patrimonioTotal += total.getPreco() * total.getQtd();
        }
        return patrimonioTotal;
    }
}
