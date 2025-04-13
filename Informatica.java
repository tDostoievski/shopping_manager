public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data, double metaVendas, double seguroEletronicos){
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, end, data);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString(){
        return super.toString() +"\n"+seguroEletronicos;
    
    }   
}
