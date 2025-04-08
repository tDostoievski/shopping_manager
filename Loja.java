public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco end;
    private Data data;

    public Loja (){

    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco end, Data data){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario; 
        this.end = end; 
        this.data = data;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco end, Data data){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.end = end;
        this.data = data;
        this.salarioBaseFuncionario = -1; 
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    public Endereco getEndereco(){
        return end;
    }
    public void setEndereco(Endereco end){
        this.end = end;
        }

    public String getNome(){
        return nome; 
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidadFuncionarios(){
        return quantidadeFuncionarios; 
    }
    
    public void setQuantidadeFuncionario(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario (){
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public String toString(){
        return nome+"\n"+quantidadeFuncionarios+"\n"+salarioBaseFuncionario+"\n"+end+"\n"+data;
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario != -1) {
            return salarioBaseFuncionario*quantidadeFuncionarios;
        }
        else {
            return -1;
        }
    }

    public char tamanhoDaLoja (){
        if (quantidadeFuncionarios < 10){
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';    
        }
        else {
            return 'G';
        }
    }
}
