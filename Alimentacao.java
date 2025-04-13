public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(){}

    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data, double metaVendas, Data dataAlvara){
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, end, data);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return super.toString() +"\n"+dataAlvara;
    }
    
}
