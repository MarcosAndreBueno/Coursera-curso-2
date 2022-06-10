package StepOneProject.testeRaters;


import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteRaters {


    public void testeRaters(int opcao, CSVParser linhas, FileResource fr) {
        linhas = fr.getCSVParser();
        PrintTestRaters printandoRaters = new PrintTestRaters();
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> ratersContados = new ArrayList<>();
        ArrayList<String> ratersRankeados= new ArrayList<>();

        //Obtendo a quantidade de usuários que deram rating em filmes.
        if (opcao == 1) {
            EncontrarQuantidadeRaters ativandoTotalRaters = new EncontrarQuantidadeRaters();
            int totalRaters = ativandoTotalRaters.encontrarQuantidadeRaters(linhas, fr);
            System.out.println("O número de raters é: "+totalRaters);
        }

        //Obtendo quantas vezes um usuário específico apareceu.
        if (opcao == 2) {
            System.out.println("Digite o id de um usuário específico que você quer procurar: ");
            String raterAtual = teclado.nextLine();
            ContarUmRaterVotos ativandoContarRater = new ContarUmRaterVotos();
            int totalDesteRater = ativandoContarRater.contar(linhas, fr, raterAtual);
            System.out.println("O rater " + raterAtual + " apareceu: " + totalDesteRater + " vezes.");
        }

        //Obtendo quantas vezes todos usuários apareceram em Array (remove raters duplicados).
        if ((opcao == 3) || (opcao == 4)) {
            ContarTodosRatersVotos ativandoContarTodos = new ContarTodosRatersVotos();
            ratersContados = ativandoContarTodos.conteTodos(linhas, fr);
            if (opcao ==3) {
                printandoRaters.printando(opcao,0, ratersContados);
            }

        }

        //Obtendo rank com os raters que mais votaram
        if (opcao == 4) {
            RatersMaisPresentesEmRank ativandoRank = new RatersMaisPresentesEmRank();
            ratersRankeados = ativandoRank.findRaterThatMostRated(ratersContados);
            printandoRaters.printando(opcao, 0, ratersRankeados);
        }
    }
}


