import java.util.Scanner;

public class ContaTerminal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("----------MENU-----------------");

        boolean menu = true;

        System.out.println("1 - Para criar conta");
        System.out.println("2 - Sair");
        int firstOption = sc.nextInt();
        if (firstOption == 1) {
            while (menu) {
                Conta conta = new Conta();
                System.out.println("Qual seu nome? ");
                String cliente = sc.next();
                conta.setNomeCliente(cliente);
                System.out.println("Digite o número da sua conta?");
                int numberOfAccount = sc.nextInt();
                conta.setNumero(numberOfAccount);
                System.out.println("Digite o número da Agencia?");
                String ag = sc.next();
                conta.setAgencia(ag);
                System.out.println(conta);

                System.out.println("0 - Deseja fazer um deposito?");
                int deposit = sc.nextInt();
                if (deposit == 0) {
                    System.out.println("Digite um valor a ser depositado");
                    conta.depositar(sc.nextInt());
                    System.out.println(conta);
                    menu = false;
                }
            }
        }

    }
}


