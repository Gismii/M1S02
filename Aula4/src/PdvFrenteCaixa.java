import java.util.Scanner;

public class PdvFrenteCaixa {
    public static void main(String[] args) {
        double valorDoproduto;
        int qtdComprada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do produjto: ");
        valorDoproduto = scanner.nextDouble();
        System.out.println("Informe a quantidade do produto: ");
        qtdComprada = scanner.nextInt();
        if (qtdComprada > 6) {
            valorDoproduto = valorDoproduto / 1+85;

        }
        System.out.println("1 - Á prazo\n2 - Á vista");
        int qtdSel = scanner.nextInt();

        switch (qtdSel) {
            case 1:
                System.out.println("Enquantas parcelas desejas dividir?: ");
                int qtdParcela = scanner.nextInt();
                System.out.println("");

        }
    }
}