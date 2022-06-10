package StepOneProject.testeDiretores;

import edu.duke.*;

import java.util.*;
import java.util.Scanner;

import org.apache.commons.csv.CSVParser;

public class TesteDiretores {
    public void testeDiretores(int opcao, CSVParser linhas, FileResource fr) {

        System.out.println();
        System.out.println("                    TESTE DIRETORES");

        Scanner teclado = new Scanner(System.in);
        //Inicializando Todos objetos que usarei para chamar as classes.
        NomeDiretores ativandoDiretores = new NomeDiretores();
        PrintTestDiretores printando = new PrintTestDiretores();
        ContarQuantasVezesApareceu contador = new ContarQuantasVezesApareceu();
        NomeFilmes ativandoFilmes = new NomeFilmes();
        DiretoresMaisPresentesEmRank ativandoRank = new DiretoresMaisPresentesEmRank();
        //Inicializando Todas arrays que usarei.
        ArrayList<String> diretoresContados = new ArrayList<>();
        ArrayList<String> diretoresArray = new ArrayList<String>();
        ArrayList<String> diretoresRank = new ArrayList<String>();
        ArrayList<String> filmes = new ArrayList<>();

        //Obtendo array com nomes dos diretores (conterá nomes repetidos, separará os nomes que estão na mesma linha do csv).
        if ((opcao == 1) || (opcao == 3) || (opcao == 4)){
            diretoresArray = ativandoDiretores.diretoresArray(linhas);
            // Limpar array da memória caso não esteja as opções que usam ele escolhidas.
            if (opcao == 1) {
                diretoresContados = (contador.contar(diretoresArray));
                diretoresArray.clear();
                printando.printTestDiretores(opcao, diretoresContados);
            }
        }

        //Obtendo array com nomes dos filmes.
        if (opcao == 2) {
            filmes = ativandoFilmes.nomeFilme(linhas, fr);
            printando.printTestDiretores(opcao, filmes);
            filmes.clear();
        }

        //Obtendo array com a contagem de quantas vezes cada diretor apareceu (também eliminará nomes repetidos).
        if ((opcao == 3)  || (opcao == 4)){
            //Primeiro: pegar nome dos diretores.
            diretoresArray = diretoresArray;

            //Segundo: pegar nome dos diretores e quantidade de vezes que aparecem.
            diretoresContados = (contador.contar(diretoresArray));

            //Terceiro: Printar
            // Limpar array da memória caso não esteja as opções que usam ele escolhidas.
            if ((opcao == 3)) {
                printando.printTestDiretores(opcao, diretoresContados);
                diretoresArray.clear();
                diretoresContados.clear();
            }
        }

        //Obtendo array com o rank dos diretores que mais apareceram e imprimindo no mesmo método.
        if (opcao == 4) {
            //Primeiro: pegar nome dos diretores.
            diretoresArray = diretoresArray;

            //Segundo: pegar nome dos diretores e quantidade de vezes que aparecem.
            diretoresContados = diretoresContados;
            diretoresArray.clear();

            //Terceiro: pegar rank dos diretores que mais apareceram.
            diretoresRank = ativandoRank.diretoresRank(diretoresContados);

            //Quarto: Printar.
            printando.printTestDiretores(opcao, diretoresRank);
            diretoresContados.clear();
            diretoresRank.clear();
        }
    }
}