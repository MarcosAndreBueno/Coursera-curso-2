package StepOneProject.testeDiretores;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintTestDiretores {

    public boolean printTestDiretores(int opcao, ArrayList<String> arrayPrint) {
        Scanner teclado = new Scanner(System.in);

        if (opcao == 1){
            System.out.println();
            System.out.println("Digite a quantidade de diretores que deseja printar (fora de ordem)");
            System.out.println("número máximo: " + arrayPrint.size());
            int numero = Integer.parseInt(teclado.nextLine());
            int count = 0;
            ArrayList<String> filtrando = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                if (filtrando.contains((arrayPrint.get(i)))) {
                    numero = numero+1;
                    continue;
                }
                if (!filtrando.contains((arrayPrint.get(i)))) {
                    count += 1;
                    //Primeiro vou retirar a quantidade de vezes que aparecem dele, para printar só o nome.
                    int finalIndex = arrayPrint.get(i).indexOf("(");
                    System.out.println(count+"º: "+arrayPrint.get(i).substring(0, finalIndex-1));
                }
                filtrando.add(arrayPrint.get(i));
            }
            filtrando.clear();
        }
        if (opcao == 2){
            System.out.println();
            System.out.println("Digite a quantidade de filmes que deseja printar (fora de ordem)");
            System.out.println("número máximo: " + arrayPrint.size());
            int numero = Integer.parseInt(teclado.nextLine());

            for (int i = 0; i < numero; i++) {
                System.out.println(i+1+"º: "+arrayPrint.get(i));
            }
        }
        if (opcao == 3) {
            System.out.println();
            System.out.println("Digite a quantidade de diretores e vezes em que aparecem que deseja printar (fora de ordem)");
            System.out.println("número máximo: " + arrayPrint.size());
            int numero = Integer.parseInt(teclado.nextLine());
            for (int i = 0; i < numero; i++) {
                System.out.println(i+1+"º: "+arrayPrint.get(i));
            }
        }

        if (opcao == 4) {
            System.out.println();
            System.out.println("Digite a quantidade de diretores em Rank que deseja printar (fora de ordem)");
            System.out.println("número máximo: " + arrayPrint.size());
            int numero = Integer.parseInt(teclado.nextLine());

            int count = 0;

            for (int i = 0; i < numero; i++) {
                count += 1;
                    if (i == 0) {
                        System.out.println("                                                        ");
                        System.out.println("      O DIRETOR QUE MAIS APARECEU FOI:               ");
                        System.out.println(count + "º: " + arrayPrint.get(i));
                        System.out.println("                                                        ");
                    }
                    if (i == 1) {
                        System.out.println("                    SEGUIDO DOS DIRETORES: ");
                        System.out.println(count + "º: " + arrayPrint.get(i));
                        System.out.println("                                                        ");
                    }
                    if ((i <= numero) && (i > 1)) {
                        System.out.println(count + "º: " + arrayPrint.get(i));
                        System.out.println("                                                        ");
                    }
                    //diretorComparando = diretorAtual;
                    //System.out.println("Os diretores que mais apareceram em Rank são: "+diretorFinal+", tendo aparecido "+count+" vezes.");
                }
            }
        return true;
        }
    }


