import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Código ANSI para negrito
        String negrito = "\u001B[1m";
        // Código ANSI para resetar a formatação
        String reset = "\u001B[0m";

        System.out.print("Enter the number of tax payers: ");
        int numeroDeContribuintes = scanner.nextInt();
        scanner.nextLine();

        double totalImposto = 0;

        ArrayList<Contribuinte> contribuintes = new ArrayList<>();

        for (int i = 0; i < numeroDeContribuintes; i++) {
            System.out.println(negrito + "Tax payer #" + (i+1) + " data:" + reset );
            System.out.print("Individual or company (i/c)?: ");
            String tipo = scanner.nextLine();

            System.out.print("Name: ");
            String nome = scanner.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = scanner.nextDouble();

            if (tipo.equals("i")) {
                System.out.print("Health expenditures: ");
                double gastosComSaude = scanner.nextDouble();
                scanner.nextLine();
                PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastosComSaude);
                contribuintes.add(pf);
            }
            else if (tipo.equals("c")) {
                System.out.print("Number of employees: ");
                int numeroFuncionarios = scanner.nextInt();
                scanner.nextLine();
                PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
                contribuintes.add(pj);
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID:");
        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            totalImposto += imposto;
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", imposto));
        }

        System.out.println("");
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalImposto));

        scanner.close();
    }
}
