public class Produto {
    private String nome;
    private double preco;
    private Data data;

    public Produto (){
    }

    public Produto(String nome, double preco, Data data){
        this.nome = nome;
        this.preco = preco;
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String toString(){
        return nome+"\n"+preco+"\n"+    data; 
    }

    public Boolean estaVencido(Data data){
        int dia = data.getDia();
        int mes = data.getMes();
        int ano = data.getAno();

        if ((dia > 20 || mes > 10) && ano >= 2023)  { 
            return true;
    }
        else{
            return false;
        }
    }
}

    