import java.util.Scanner;

public class Calculadora {
    public static void main(String []args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        boolean ativo = true;
        int opcao;
        
        while (ativo) {
            //Solicita o número 1
            System.out.println("Número 1:");
            num1 = entrada.nextDouble();
            //Solicita o número 2
            System.out.println("Número 2:");
            num2 = entrada.nextDouble();
            
            System.out.println
            ("Selecione a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println
                    ("Resultado da soma: "+(num1+num2));
                    break;
                case 2:
                    System.out.println
                    ("Resultado da subtração: "+(num1-num2));
                    break;
                case 3:
                    System.out.println
                    ("Resultado da multiplicação: "+(num1*num2));
                    break;
                case 4:
                    System.out.println
                    ("Resultado da divisão: "+(num1/num2));
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            
            //Pergunta se o usuário deseja fazer outra operação
            System.out.println("Deseja fazer outra operação ?");
            System.out.println("1 - SIM");
            System.out.println("0 - NÃO");
            opcao = entrada.nextInt();
            
            if (opcao == 1) {
                ativo = true;
            } else {
                ativo = false;
            }
        }
    }
}