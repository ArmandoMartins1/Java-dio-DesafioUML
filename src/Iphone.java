import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {

        boolean b = true;

        System.out.println("ligando aparelho...");
        System.out.println(" -------- ");

        System.out.println("DIGITE 1 - APARELHO TELEFONICO ");
        System.out.println("DIGITE 2 - REPRODUTOR MUSICAL ");
        System.out.println("DIGITE 3 - NAVEGAR NA INTERNET ");
        System.out.println("DIGITE 9 - MOSTRAR O MENU NOVAMENTE");
        System.out.println("DIGITE 4 - SAIR ");
        while (b) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero: ");
            int x = scanner.nextInt();

            AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
            NavegadorInternet navegadorInternet = new NavegadorInternet();
            ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

            switch (x) {
                case 1:
                    System.out.println("-- APARELHO TELEFONICO -- ");
                    System.out.println("# 1 LIGAR");
                    System.out.println("# 2 ATENDER");
                    System.out.println("# 3 INICIAR CORREIO DE VOZ");
                    System.out.println("# 4 VOLTAR");

                    int z = scanner.nextInt();

                    switch (z) {
                        case 1:
                            aparelhoTelefonico.ligar("(81).9-9909-8785");

                            break;
                        case 2:
                            aparelhoTelefonico.atender();

                            break;

                        case 3:
                            aparelhoTelefonico.iniciarCorreioVoz();

                            break;

                        case 4:
                            System.out.println("retornando ao menu...");

                            break;

                        default:
                            System.out.println("opção invalida");
                            System.out.println("retornando ao menu...");

                            break;
                    }
                    break;

                case 2:
                    System.out.println("-- REPRODUTOR MUSICAL -- ");
                    System.out.println("# 1 TOCAR");
                    System.out.println("# 2 PAUSAR");
                    System.out.println("# 3 SELECIONAR");
                    System.out.println("# 4 VOLTAR ");

                    int p = scanner.nextInt();
                    switch (p) {
                        case 1:
                            reprodutorMusical.tocar();
                            break;
                        case 2:
                            reprodutorMusical.pausar();
                            break;
                        case 3:
                            reprodutorMusical.selecionarMusica("Dias atrás");
                            break;
                        case 4:
                            System.out.println("retornando ao menu...");
                            break;
                        default:
                            System.out.println("opção invalida, retornando ao menu");
                            break;
                    }
                    break;
                case 3:
                System.out.println("-- NAVEGAR NA INTERNET -- ");
                System.out.println("# 1 ADICIONAR NOVA ABA");
                System.out.println("# 2 EXIBIR PAGINA");
                System.out.println("# 3 ATUALIZAR PAGINA");
                System.out.println("# 4 VOLTAR ");

                int f = scanner.nextInt();
                    switch (f) {
                        case 1:
                            navegadorInternet.adicionarNovaAba();
                            break;
                        case 2:
                            navegadorInternet.exibirPagina("www.dio.me");
                            break;

                        case 3:
                            navegadorInternet.atualizarPagina();
                            break;
                        case 4:
                            System.out.println("retornando ao menu...");
                            break;
                        default:
                            System.out.println("opção invalida, retornando ao menu");
                            break;
                    }
                    break;
                case 4:
                    b = false;
                    System.out.println("Saindo...");
                    break;
                case 9:
                    System.out.println("DIGITE 1 - APARELHO TELEFONICO ");
                    System.out.println("DIGITE 2 - REPRODUTOR MUSICAL ");
                    System.out.println("DIGITE 3 - NAVEGAR NA INTERNET ");
                    System.out.println("DIGITE 9 - MOSTRAR O MENU NOVAMENTE");
                    System.out.println("DIGITE 4 - SAIR ");
                    break;
                default:
                    System.out.println("opção invalida");
                    System.out.println("retornando ao menu");
                    System.out.println("digite 9 para mostrar o menu");
                    break;
            }
        }

       

    }
}
