package Carro.java;

public class Carros extends Veiculo {
    public double calcularTotal(int dias) {
        return preco * dias - 5;
    }
}
