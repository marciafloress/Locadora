package Carro.java;

public class Veiculo {
    String modelo;
    double preco;

    public void setModelo(String m) {
        modelo = m + " ";
    }

    public void setPreco(double p) {
        preco = p * 1;
    }

    public double calcularTotal(int dias) {
        return preco * dias + 10;
    }
}
