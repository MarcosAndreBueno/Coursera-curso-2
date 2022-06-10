package StepOneProject.testeRaters;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintTestRaters {
    public void printando(int opcao, int quantidadeRaters, ArrayList<String> arrayPrintRaters) {
        Scanner teclado = new Scanner(System.in);

        if (opcao == 3){
            System.out.println("Digite a quantidade de Raters (fora de ordem) que deseja ver quantas vezes votaram");
            System.out.println("número máximo: " + arrayPrintRaters.size());
            quantidadeRaters = Integer.parseInt(teclado.nextLine());
            for (int i = 0; i < quantidadeRaters; i++){
                System.out.println(arrayPrintRaters.get(i));
            }
        }

        if (opcao == 4) {
            System.out.println("Digite a quantidade de raters que você quer no rank \"RatersMaisPresentesEmRank\" ");
            System.out.println("número máximo: "+arrayPrintRaters.size());
            quantidadeRaters = Integer.parseInt(teclado.nextLine());

            for (int i = 0; i < quantidadeRaters; i++) {
                if (i == 1) {
                    System.out.println(" ---------------------------------------------");
                    System.out.println(i + "º: O rater que mais apareceu foi");
                    System.out.println(arrayPrintRaters.get(i));
                    System.out.println();
                }
                if (i == 2) {
                    System.out.println("Seguido de: ");
                    System.out.println(i + "º: " + arrayPrintRaters.get(i));
                    System.out.println();
                }
                if ((i > 2) && (i < quantidadeRaters)) {
                    System.out.println(i + "º: " + arrayPrintRaters.get(i));
                    System.out.println();
                }
            }
        }
    }
}


