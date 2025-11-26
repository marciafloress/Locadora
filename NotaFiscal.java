public class NotaFiscal {
    private double valorTotal;
    private String dataLocacao;
    private int numeroDaNota;
    private long cnpj;
    private String observacoes;

    public NotaFiscal(double valorTotal, String dataLocacao, int numeroDaNota, long cnpj, String observacoes) {
        this.valorTotal = valorTotal;
        this.dataLocacao = dataLocacao;
        this.numeroDaNota = numeroDaNota;
        this.cnpj = cnpj;
        this.observacoes = observacoes;
    }

    public void setNumeroDaNota(int numeroDaNota) {
        this.numeroDaNota = numeroDaNota;
    }
    public int getNumeroDaNota() {
        return numeroDaNota;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataLocacao = dataDaVenda;
    }
    public String getDataDaVenda() {
        return dataLocacao;
    }

    public void setValor(double valor) {
        this.valorTotal = valor;
    }
    
    public double getValor() {
        return valorTotal;
    }
    
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    
    public long getCnpj() {
        return cnpj;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        return "NotaFiscal [valorTotal=" + valorTotal + ", dataLocacao=" + dataLocacao + ", numeroDaNota=" + numeroDaNota + ", cnpj=" + cnpj + ", observacoes=" + observacoes + "]";
    }
}
