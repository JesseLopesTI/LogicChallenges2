/**
 * Classe que informa a alíquota de contribuição mensal do IRPF (Imposto de Renda de Pessoa Física), com base no valor bruto mensal do salário de um contribuinte.
 * 
 * @author Jessé Lopes
 *
 **/

import java.util.Scanner;

public class ContribuicaoMensalDoIrpf {

  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {

      double salario;
      double contribuicaoMensal;

      System.out.print("Informe o seu salário: ");
      salario = scanner.nextDouble();

      if (salario <= 1903.98) {
        System.out.print("\n" + "Alíquota: isento" + "\n" + "Parcela a deduzir do IRPF: R$ 0,00" + "\n" + "Contribuição anual: R$ 0,00");
      } else if (salario >= 1903.99 && salario <= 2826.65) {
          System.out.print("\n" + "Alíquota: 7,5%" + "\n" + "Parcela a deduzir do IRPF: R$ " + ( contribuicaoMensal = (7.5 * salario) / 100) + "\n" + "Contribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (salario >= 2826.66 && salario <= 3751.05) {
        System.out.print("\n" + "Alíquota: 15%" + "\n" + "Parcela a deduzir do IRPF: R$ " + ( contribuicaoMensal = (15 * salario) / 100) + "\n" + "Contribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (salario >= 3751.06 && salario <= 4664.68) {
        System.out.print("\n" + "Alíquota: 22,5%" + "\n" + "Parcela a deduzir do IRPF: R$ " + ( contribuicaoMensal = (22.5 * salario) / 100) + "\n" + "Contribuição anual: R$ " + contribuicaoMensal * 12);
      } else {
        System.out.print("\n" + "Alíquota: 27,5" + "\n" + "Parcela a deduzir do IRPF: R$ " + ( contribuicaoMensal = (27.5 * salario) / 100) + "\n" + "Contribuição anual: R$ " + contribuicaoMensal * 12);
      }
    }
  }
}