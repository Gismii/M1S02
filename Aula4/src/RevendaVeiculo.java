import java.util.Scanner;

public class RevendaVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual modelo?: ");
        String veiculo = scanner.next();
        String decisão = scanner.next();

        switch (veiculo) {
            case "hatch":
                System.out.println("Temos esse modelo sim.! Vamos fechar acompra? ");

                switch (decisão) {
                    case "sim":
                        System.out.print("Compra efetuado com sucesso!!");
                        break;


                }

                    case "seda":
                    System.out.println("Todos foram vendidos ontem, podemos resevar a proxima frota se preferir!");
                    switch (decisão) {
                        case "sim":
                            System.out.print("Reserva realizada");
                            break;
                        case "4x4":
                            System.out.println("Não temos no momento!");
                            break;
                        default:
                            System.out.println("Não trabalhamos com esse modelo. Viste nosso site: https://github.com/Gismii");


                    }
                }
            }
        }


