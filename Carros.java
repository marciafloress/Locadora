public class Carros extends Veiculo {

    protected Boolean caçamba;
    protected Boolean rack;
    protected int numeroPortas;
    
    public Carros(String modelo, double precoDiaria, int ano, int kmRodados, String chassi, String placa, String cor,
            Boolean caçamba, Boolean rack, int numeroPortas) {
        super(modelo, precoDiaria, ano, kmRodados, chassi, placa, cor);
        this.caçamba = caçamba;
        this.rack = rack;
        this.numeroPortas = numeroPortas;
    }

    public Boolean getCaçamba() {
        return caçamba;
    }

    public void setCaçamba(Boolean caçamba) {
        this.caçamba = caçamba;
    }

    public Boolean getRack() {
        return rack;
    }

    public void setRack(Boolean rack) {
        this.rack = rack;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "Carros [caçamba=" + caçamba + ", rack=" + rack + ", numeroPortas=" + numeroPortas + "]";
    }
    
}
