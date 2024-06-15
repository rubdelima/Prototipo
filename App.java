import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String user;
        int opcao, pin, confirm, cont = 0;
        double renda, pSaude, alim, despFix, lazer, escola, sobra, porc;
        Console console = System.console();

        while (true) {

            System.out.println();
            System.out.println("Escolha uma opção");
            System.out.println("1. Cadastro ");
            System.out.println("2. Login ");
            System.out.println("3. Gerencie seus gastos mensais ");
            System.out.println("4. Gerenciador de sonhos ");
            System.out.println("5. Ensino financeiro ");
            System.out.println("6. Sair ");
            System.out.println();

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("-----------------");
                    System.out.println("Faça seu cadastro");
                    System.out.println("-----------------");

                    System.out.print("Nome de usuario: ");
                    user = sc.nextLine();
                    System.out.print("Senha: ");
                    pin = sc.nextInt();
                    System.out.print("Confirme a senha: ");
                    confirm = sc.nextInt();
                    System.out.println();

                    if (confirm != pin) {
                        while (true) {
                            System.out.println("As senhas não conferem, digite novamente.");

                            System.out.print("Senha: ");
                            pin = sc.nextInt();
                            System.out.print("Confirme a senha: ");
                            confirm = sc.nextInt();
                            System.out.println();

                            if (confirm == pin) {
                                System.out.println("Cadastro feito!");

                                break;
                            }
                        }
                    }
                    console.printf("\033[H\033[2J"); // Clear the terminal
                    console.flush();
                    System.out.println("Cadastro feito!");
                    break;
                case 2:

                    System.out.println("-----------");
                    System.out.println("Fazer login");
                    System.out.println("-----------");

                    System.out.print("Usuario: ");
                    user = sc.nextLine();
                    System.out.print("Senha: ");
                    pin = sc.nextInt();
                    System.out.println();

                    console.printf("\033[H\033[2J"); // Clear the terminal
                    System.out.println("Login feito");

                    break;
                case 3:

                    System.out.println("----------------------------");
                    System.out.println("Gerencie seus gastos mensais");
                    System.out.println("----------------------------");

                    System.out.print("informe sua renda liquida: ");
                    renda = sc.nextDouble();

                    System.out.print("informe o gasto para saúde: ");
                    pSaude = sc.nextDouble();

                    System.out.print("informe o gasto com alimentação: ");
                    alim = sc.nextDouble();

                    System.out.print("informe a despesa fixa: ");
                    despFix = sc.nextDouble();

                    System.out.print("informe o quanto você gasta com lazer: ");
                    lazer = sc.nextDouble();

                    System.out.print("informe o quanto você gasta com educação: ");
                    escola = sc.nextDouble();

                    System.out.println("");

                    sobra = renda - pSaude - alim - despFix - lazer - escola;
                    porc = sobra / renda;

                    System.out.println();
                    console.printf("\033[H\033[2J"); // Clear the terminal

                    System.out.println("Verifique abaixo como está a sua situação de seus gastos");
                    System.out.println();

                    System.out.printf("Plano de Saúde: %.2f%% %n ", (pSaude / renda) * 100);

                    System.out.printf("Alimentação: %.2f%% %n ", (alim / renda) * 100);

                    System.out.printf("Despesas Fixas: %.2f%% %n ", (despFix / renda) * 100);

                    System.out.printf("Despesas com Lazer: %.2f%% %n ", (lazer / renda) * 100);

                    System.out.printf("Educação: %.2f%% %n ", (escola / renda) * 100);

                    System.out.println("");

                    if (sobra >= 0) {
                        System.out.println("Final do mês: R$" + sobra);
                        System.out.println(
                                "Você está com grana sobrando, venha descobrir a melhor maneira de utilizar esse dinheiro!");
                    }

                    else {
                        System.out.println("Final do mês: R$" + sobra);
                        System.out.println(
                                "Seu saldo está negativo :( Selecione a nossa opção de esducação financeira e saiba como sair dessa situação :)");
                    }
                    break;

                case 4:

                    console.printf("\033[H\033[2J"); // Clear the terminal
                    System.out.println("---------------------------------------------");
                    System.out.println("Faça seus sonhos virarem realidade Com a GDS!");
                    System.out.println("---------------------------------------------");

                    System.out.println(
                            "Você tem uma grana sobrando no final do mês? Venha descobrir a melhor maneira de utilizar este dinheiro para conquistar os seus sonhos!");

                    System.out.println("Volte mais tarde");
                    System.out.println("Estamos trabalhando...");

                    break;
                case 5:

                    console.printf("\033[H\033[2J"); // Clear the terminal
                    System.out.println("----------------------------------------------");
                    System.out.println("Venha aprender mais sobre educação financeira!");
                    System.out.println("----------------------------------------------");

                    System.out.println("Você fez a escolha certa em escolher aprender mais!");
                    System.out.println("Volte mais tarde");
                    System.out.println("Estamos trabalhando...");

                    break;
                case 6:
                    console.printf("\033[H\033[2J"); // Clear the terminal
                    System.out.println("Saindo...");
                    System.exit(0);
                    return;
                default:
                    console.printf("\033[H\033[2J"); // Clear the terminal
                    System.out.println("--------------------------------");
                    System.out.println("Opção invalida, tente novamente.");
                    System.out.println("--------------------------------");
            }
        }

    }

}
