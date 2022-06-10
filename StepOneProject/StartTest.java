package StepOneProject;

import StepOneProject.testeDiretores.TesteDiretores;
import StepOneProject.testeRaters.TesteRaters;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {
        FileResource fr = new FileResource("StepOneProject/database/ratedmoviesfull.csv");
        CSVParser linhas = fr.getCSVParser();

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("                    TESTE INICIALIZADO");

        TesteDiretores startTestDiretores = new TesteDiretores();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual teste quer fazer?");
        System.out.println("1 para TesteDiretores");
        System.out.println("2 para TesteRaters");
        int opcaoInicializadora = Integer.parseInt(teclado.nextLine());

        if (opcaoInicializadora == 1) {
            System.out.println();
            System.out.println("Escolha o que você quer testar em \"TesteDiretores\"");

            System.out.println("1 para salvar e printar Array com nome dos diretores");
            System.out.println("2 para salvar e printar Array com nome dos filmes");
            System.out.println("3 para salvar e printar Array com nome dos diretores e quantas vezes apareceram");
            System.out.println("4 para salvar e printar Array com nome dos diretores que mais apareceram em Rank");
            int opcao = Integer.parseInt(teclado.nextLine());
            while (opcao >= 5) {
                System.out.println("Opção invalida, digita uma opção valida");
                opcao = Integer.parseInt(teclado.nextLine());
            }
            startTestDiretores.testeDiretores(opcao, linhas, fr);
        }


        fr = new FileResource("StepOneProject/database/ratings.csv");
        linhas = fr.getCSVParser();
        TesteRaters startTestRaters = new TesteRaters();

        if (opcaoInicializadora == 2) {
            System.out.println();
            System.out.println("Escolha o que você quer testar em \"TesteRaters\"");

            System.out.println("1 visualizar quantidade de Raters no CSV");
            System.out.println("2 visualizar quantidade de ratings de um Rater de Id específicado");
            System.out.println("3 visualizar quantidade de ratings de todos Raters (fora de ordem)");
            System.out.println("4 para visualizar rank dos Raters que mais deram ratings");
            int opcao = Integer.parseInt(teclado.nextLine());
            while (opcao >= 5) {
                System.out.println("Opção invalida, digita uma opção valida");
                opcao = Integer.parseInt(teclado.nextLine());
            }
            startTestRaters.testeRaters(opcao, linhas, fr);
        }

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("                    TESTE FINALIZADO");
    }
}
