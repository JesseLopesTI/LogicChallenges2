/**
 * Classe que informa a alíquota de contribuição mensal do INSS, com base na categoria do contribuinte.
 *
 * @author Jessé Lopes
 * 
 **/

import java.util.Scanner;

public class ContribuicaoMensalDoInss {

  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)) {

      double salarioDeContribuicao;
      double contribuicaoMensal;
      int categoria;

      System.out.print("Informe o seu salário: ");
      salarioDeContribuicao = scanner.nextDouble();

      System.out.print("\nCategorias:\n" + "\n1. Empregado" + "\n2. Empregado doméstico" + "\n3. Trabalhador avulso" + "\n4. Contribuinte individual" + "\n5. Facultativo\n" + "\nDigite o código da categorias em que se enquadra: ");
      categoria = scanner.nextInt();

      if (categoria <= 3 && salarioDeContribuicao <= 1045.00) {
        System.out.print("\nAlíquota para recolhimento: 7,5%" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (7.5 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria <= 3 && salarioDeContribuicao >= 1045.01 && salarioDeContribuicao <= 2089.60) {
        System.out.print("\nAlíquota para recolhimento: 9%" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (9 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria <= 3 && salarioDeContribuicao >= 2089.61 && salarioDeContribuicao <= 3134.40) {
        System.out.print("\nAlíquota para recolhimento: 12%" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (12 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria <= 3 && salarioDeContribuicao >= 3134.41 && salarioDeContribuicao <= 6101.06) {
        System.out.print("\nAlíquota para recolhimento: 14%" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (14 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria >= 4 && salarioDeContribuicao <= 1045.00) {
        System.out.print("\nAlíquota para recolhimento: 5% (Não da direito a aposentadoria por tempo de contribuição e certidão de tempo contribuição)" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (7.5 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria >= 4 && salarioDeContribuicao <= 1045.00) {
        System.out.print("\nAlíquota para recolhimento: 11% (Não da direito a aposentadoria por tempo de contribuição e certidão de tempo contribuição)" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (9 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      } else if (categoria >= 4 && salarioDeContribuicao >= 1045.00 && salarioDeContribuicao <= 6101.06) {
        System.out.print("\nAlíquota para recolhimento: 20%" + "\nParcela a deduzir do INSS: R$ " + (contribuicaoMensal = (12 * salarioDeContribuicao) / 100) + "\nContribuição anual: R$ " + contribuicaoMensal * 12);
      }
    }
  }
}