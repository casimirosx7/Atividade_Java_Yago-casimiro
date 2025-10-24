import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite quanto você ganha por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        
        double salarioBruto = valorPorHora * horasTrabalhadas;
        
        
        double impostoRenda = salarioBruto * 0.11; 
        double inss = salarioBruto * 0.08;         
        double sindicato = salarioBruto * 0.05;    
        
        
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        
        System.out.println("\n=== DEMONSTRATIVO DE PAGAMENTO ===");
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("INSS (8%%): R$ %.2f%n", inss);
        System.out.printf("Sindicato (5%%): R$ %.2f%n", sindicato);
        System.out.printf("Imposto de Renda (11%%): R$ %.2f%n", impostoRenda);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        
        scanner.close();
    }
}