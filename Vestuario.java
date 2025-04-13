public class Vestuario extends Loja{
    private boolean produtoImportado;

    public Vestuario (){
    }

    public Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data, boolean produtoImportado){
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, end, data);
        this.produtoImportado = produtoImportado;
    }

    public void setProdutoImportado(boolean produtoImportado) {
        this.produtoImportado = produtoImportado;
    }

    public boolean getProdutoImportado(){
        return produtoImportado;
    }

    public String toString(){
        return super.toString() +"\n"+produtoImportado;
    }
}
