import java.util.*;

public class Principal {
     public static void main (String [] args){
          Scanner entrada = new Scanner(System.in);
          Scanner entradaString = new Scanner(System.in);

          Loja l = new Loja();
          Endereco end = new Endereco(); 

          System.out.println("Digite o nome da loja: ");
          l.setNome(entradaString.nextLine());
          System.out.println("Digite a quantidade de funcionários da loja: ");
          l.setQuantidadeFuncionario(entrada.nextInt());
          System.out.println("Digite o salário base dos funcionários da loja: ");
          l.setSalarioBaseFuncionario(entrada.nextDouble());
          

          // Entradas endereço
          System.out.println("Digite o nome da rua:");
          end.setNomeDaRua(entradaString.nextLine());
          System.out.println("Digite a cidade:");
          end.setCidade(entradaString.nextLine());
          System.out.println("Digite o estado:");
          end.setEstado(entradaString.nextLine());
          System.out.println("Digite o país:");
          end.setPais(entradaString.nextLine());
          System.out.println("Digite o CEP:");
          end.setCep(entradaString.nextLine());
          System.out.println("Digite o número:");
          end.setNumero(entradaString.nextLine());
          System.out.println("Digite o complemento:");
          end.setComplemento(entradaString.nextLine());
          
          l.setEndereco(end);

          System.out.println("Digite o dia de fundação da loja:");
          int dia = entrada.nextInt();
          System.out.println("Digite o mês de fundação da loja:");
          int mes = entrada.nextInt();
          System.out.println("Digite o ano de fundação da loja:");
          int ano = entrada.nextInt();
          Data dataFundacao = new Data(dia, mes, ano);
          
          l.setData(dataFundacao);
  
          entrada.close();
          entradaString.close();
     
          System.out.println(l.toString());
    }

}