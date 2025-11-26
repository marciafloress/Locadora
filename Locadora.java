import java.util.*;

public class Locadora {
    protected String nomeLocadora;
    List<Agenda> agendas = new ArrayList<>();
    List<NotaFiscal> notas = new ArrayList<>();
    List<Carros> carros = new ArrayList<>();
    List<Moto> motos = new ArrayList<>();


    public void adicionarCarro(String modelo, double precoDiaria, int ano, int kmRodados, String chassi, String placa, String cor,
        Boolean caçamba, Boolean rack, int numeroPortas){
        Carros novoCarro = new Carros(modelo, precoDiaria, ano, kmRodados, chassi, placa, cor, caçamba, rack, numeroPortas);
        carros.add(novoCarro);
    }
    public void adicionarMoto(String modelo, double precoDiaria, int ano, int kmRodados, String chassi, String placa, String cor,
        String pezinho, String capacete){
        Moto novaMoto = new Moto(modelo, precoDiaria, ano, kmRodados, chassi, placa, cor, pezinho, capacete);
        motos.add(novaMoto);
        }
    public void agendar(Veiculo Veiculo, Date data, int dias) {
        Agenda novaAgenda = new Agenda(Veiculo, data, dias);
        agendas.add(novaAgenda);
    }

    public void gerarNota(Veiculo veiculo,Agenda agenda,double valorTotal, String dataLocacao, int numeroDaNota, long cnpj, String observacoes) {
        double valorNota = veiculo.getPrecoDiaria() * agenda.getDias();
        NotaFiscal notanova = new NotaFiscal(valorNota, dataLocacao, numeroDaNota, cnpj, observacoes);
        System.out.println("Nota gerada com sucesso!");
        notas.add(notanova);
    }
    
}
