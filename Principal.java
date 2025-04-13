import java.util.*;


public class Principal {
     public static void main (String [] args){
          Scanner entradaString = new Scanner(System.in);
          Scanner entrada = new Scanner(System.in);
          int count = 0;

          
          
          while (count == 0){
               System.out.println("(1) Criar uma loja: "+"\n"+"(2) criar um produto"+"\n"+"(3) Sair");
               int menu = entrada.nextInt();

               if (menu == 1){
                    Loja l = new Loja();
                    Endereco end = new Endereco();
                    Data data = new Data();

                    System.out.println("Insira o nome da Loja: ");
                    l.setNome(entradaString.nextLine());
                    System.out.println("Insira a quantidade de funcionários: ");
                    l.setQuantidadeFuncionario(entrada.nextInt());
                    System.out.println("Insira o salário base dos funcionários: ");
                    l.setSalarioBaseFuncionario(entrada.nextDouble());
               
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

                    System.out.println("Insira o dia de inauguração da loja: ");
                    data.setDia(entrada.nextInt());
                    System.out.println("Insira o mes de inauguração da loja: ");
                    data.setMes(entrada.nextInt());
                    System.out.println("Insira o ano de inauguração da loja: ");
                    data.setAno(entrada.nextInt());

                    l.setData(data);

                    Cosmetico cos = new Cosmetico(
                         l.getNome(),
                         l.getQuantidadFuncionarios(),
                         l.getSalarioBaseFuncionario(),
                         l.getEndereco(),
                         l.getData(),
                         2.2
                    );

                    System.out.println(cos.toString());

                    count = 1;
                    }
               else if (menu == 2){
                    Produto p = new Produto();
                    Data data = new Data();

                    System.out.println("Insira o nome do produto: ");
                    p.setNome(entradaString.nextLine());
                    System.out.println("Insira o preço do produto: ");
                    p.setPreco(entrada.nextDouble());

                    System.out.println("Insira o dia da data de validade do produto: ");
                    data.setDia(entrada.nextInt());
                    System.out.println("Insira o mes da data de validade do produto: ");
                    data.setMes(entrada.nextInt());
                    System.out.println("Insira o ano da data de validade do produto: ");
                    data.setAno(entrada.nextInt());

                    p.setData(data);

                    if (p.estaVencido(data) == true){
                         System.out.println("O produto está vencido!");
                    }
                    else {
                         System.out.println("Produto não vencido!");
                    }

                    count = 1;
               }
               else if (menu == 3){
                    count = 1;
               }
               else {
               System.out.println("Você não digitou nenhuma opção válida;");
               count = 0; 
               }
     
          }

          entrada.close();
          entradaString.close();
     }


    
}

