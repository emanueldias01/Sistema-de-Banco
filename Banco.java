import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {


        double saldo = 2500;
        String tipoConta = "corrente";
        String nomeCliente = "Emanuel";
        String menu = String.format("***********************\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: %s\n" +
                "Tipo conta: %s \n "+
                "Saldo Inicial: %f \n "  +


                "\n" +
                "Operações\n" +
                "\n" +
                "1- Consultar saldos\n" +
                "2- Receber valor\n" +
                "3- Transferir valor\n" +
                "4- Sair\n" +
                "\n" +
                "Digite a opção desejada:", nomeCliente,tipoConta,saldo);

        System.out.println(menu);

        //área de requerimento do usuário:

        Scanner leitura = new Scanner(System.in);

        double opcao = leitura.nextInt();


        //área de operações:

        while(opcao != 4){

            if(opcao == 1){
                System.out.println("seu saldo é de " + saldo);
                opcao = 0;

                System.out.println(menu);

                opcao = leitura.nextInt();


            } else if (opcao == 2) {
                opcao = 0;
                Scanner leituraReceber = new Scanner(System.in);
                System.out.println("Digite quanto você quer receber: ");
                double receber = leituraReceber.nextDouble();



                saldo += receber;


                System.out.println("Você recebeu " + receber);
                System.out.println("Seu saldo é de " + saldo);


                System.out.println(menu);

                opcao = leitura.nextInt();

            } else if (opcao == 3) {
                opcao = 0;
                Scanner leituraRetirar = new Scanner(System.in);
                System.out.println("Digite o quanto você quer retirar: ");
                double retirar = leituraRetirar.nextDouble();

                if(retirar > saldo){
                    System.out.println("não foi possível fazer o saque devido o saldo insuficiente");

                }else {

                    saldo -= retirar;
                    System.out.println("Você retirou " + retirar);
                    System.out.println("Seu saldo é de " + saldo);

                }


                System.out.println(menu);

                opcao = leitura.nextInt();
            }

                //trava:
                if (opcao > 4 || opcao < 1){

                    opcao = 0;

                    System.out.println("Operação inválida, tente novamente");
                    System.out.println(menu);

                    opcao = leitura.nextInt();

                }


            }


        }


    }
