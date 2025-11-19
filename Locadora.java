public class Locadora {
    Agenda agenda = new Agenda();

    public void agendar(Veiculo v, String data) {
        agenda.reservas.add(v.modelo + data);
    }

    public void gerarNota(Veiculo v, int dias) {
        NotaFiscal n = new NotaFiscal();
        n.valor = v.calcularTotal(dias);
        n.imprimir();
    }
}
