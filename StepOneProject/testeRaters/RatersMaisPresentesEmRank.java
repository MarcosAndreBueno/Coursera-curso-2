package StepOneProject.testeRaters;

import java.util.ArrayList;

public class RatersMaisPresentesEmRank {

    public ArrayList<String> findRaterThatMostRated(ArrayList<String> ratersContados) {
        System.out.println();
        System.out.println("FindRaterThatMostRated MÉTODO");
        System.out.println();

        ArrayList<String> ratersRankeados = new ArrayList<>();

        int maiorAteEntao = 0;
        String diretorFinal = "";

        for (int i = 0; i < ratersContados.size(); i++) {
            maiorAteEntao = 0;
            for (int j = 0; j < ratersContados.size(); j++) {
                String diretorAtual = ratersContados.get(j);
                int inicio = diretorAtual.indexOf("(");
                int termino = diretorAtual.indexOf(")");
                String quantidade = diretorAtual.substring(inicio + 1, termino);
                int quantidadeNum = Integer.parseInt(quantidade);
                if ((quantidadeNum > maiorAteEntao) && (!ratersRankeados.contains(diretorAtual))) {
                    maiorAteEntao = quantidadeNum;
                    diretorFinal = diretorAtual;
                }
            }
            ratersRankeados.add(diretorFinal);
        }
        return ratersRankeados;
    }
}