public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(){}

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data, double metaVendas){
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, end, data);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString(){
        return super.toString()+"\n"+metaVendas;
    }
}