package Exercicio2;

// Classe VideoGame herdando de Produto
public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;

    // Construtores
    public VideoGame() {
    }
    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    // Getters and Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }
    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    // Método herdado da interface Imposto
    @Override
    public double calculaImposto() {
        if (isUsado){
            return super.getPreco() + (super.getPreco() * 0.25);
        }
        else {
            return super.getPreco() + (super.getPreco() * 0.45);
        }
    }
}
