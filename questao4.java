import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quanto você ganha por hora: R$ ");
        double valorPorHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salarioMensal = valorPorHora * horasTrabalhadas;
        System.out.printf("Seu salário este mês será de: R$ %.2f%n", salarioMensal);
        scanner.close();
    }
}
