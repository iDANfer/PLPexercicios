import java.util.Scanner;

public class Main {
    public static double totalapagar(int codigoProduto, int qtdComprada) {
        switch (codigoProduto) {
            case 0:
                return 0;
            case 1:
                return qtdComprada * 0.5;
            case 2:
                return qtdComprada * 1.00;
            case 3:
                return qtdComprada * 4.00;
            case 5:
                return qtdComprada * 7.00;
            case 9:
                return qtdComprada * 8.00;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tabela de Produtos:");
            System.out.println("Código 1 - Produto A - R$0.50");
            System.out.println("Código 2 - Produto B - R$1.00");
            System.out.println("Código 3 - Produto C - R$4.00");
            System.out.println("Código 5 - Produto D - R$7.00");
            System.out.println("Código 9 - Produto E - R$8.00");
            System.out.println("Código 0 - Finalizar");

            System.out.print("Informe o código do produto (ou 0 para sair): ");
            int codigoProduto = scanner.nextInt();

            if (codigoProduto == 0) {
                System.out.println("Finalizando programa");
                break;
            }

            System.out.print("Informe a quantidade desejada: ");
            int qtdComprada = scanner.nextInt();
            double precoTotal = totalapagar(codigoProduto, qtdComprada);

            if (precoTotal >= 0) {
                System.out.println("O preço do produto é R$" + precoTotal);
            } else {
                System.out.println("Código inválido");
            }
        }
    }
}
