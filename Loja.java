public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario; 
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1; 
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
        return nome+"\n"+quantidadeFuncionarios+"\n"+salarioBaseFuncionario;
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
