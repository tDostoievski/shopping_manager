public class Cosmetico extends Loja {
    private double taxaDeComercializacao;

    public Cosmetico (){
    }

    public Cosmetico (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data, double taxaDeComercializacao){
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, end, data);
        this.taxaDeComercializacao = taxaDeComercializacao;
    }

    public double getTaxaDeComercializacao() {
        return taxaDeComercializacao;
    }

    public void setTaxaDeComercializacao(double taxaDeComercializacao) {
        this.taxaDeComercializacao = taxaDeComercializacao;
    }

    public String toString(){
        return super .toString() +"\n"+taxaDeComercializacao;
    }
}
