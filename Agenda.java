import Carro.java.Veiculo;
import java.util.Date;

public class Agenda {
    private Date data;
    private int dias;
    private Veiculo Veiculo;



    public Agenda(Veiculo Veiculo, Date data, int dias) {
        this.Veiculo = Veiculo;
        this.data = data;
        this.dias = dias;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(Veiculo Veiculo) {
        this.Veiculo = Veiculo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agenda{");
        sb.append("data=").append(data);
        sb.append(", dias=").append(dias);
        sb.append(", Veiculo=").append(Veiculo);
        sb.append('}');
        return sb.toString();
    }  
}
