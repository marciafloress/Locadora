public class Main {
    public static void main(String[] args) {
        Locadora l = new Locadora();
        Veiculo v = new Carro();
        v.setModelo("Gol");
        v.setPreco(120);

        l.agendar(v, "12/04/2025");
        l.gerarNota(v, 3);
    }
}
