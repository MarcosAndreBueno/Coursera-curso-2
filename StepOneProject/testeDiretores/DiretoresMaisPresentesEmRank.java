package StepOneProject.testeDiretores;

import java.util.ArrayList;

public class DiretoresMaisPresentesEmRank {
    public ArrayList<String> diretoresRank(ArrayList<String> diretoresContados) {
        String diretorAtual = "";
        String diretorComparando = "";
        String diretorFinal = "";
        int inicio = 0;
        int termino = 0;
        String quantidade = "";
        int quantidadeNum = 0;
        int maiorAteEntao = 0;
        ArrayList<String> resultado = new ArrayList<String>();
        int countProArray = 0;

        for (int i = 0; i < diretoresContados.size(); i++) {
            maiorAteEntao = 0;
            for (int j = 0; j < diretoresContados.size(); j++) {
                diretorAtual = diretoresContados.get(j);
                inicio = diretorAtual.indexOf("(");
                termino = diretorAtual.indexOf(")");
                quantidade = diretorAtual.substring(inicio + 1, termino);
                quantidadeNum = Integer.parseInt(quantidade);
                if ((quantidadeNum > maiorAteEntao) && (!resultado.contains(diretorAtual))) {
                    maiorAteEntao = quantidadeNum;
                    diretorFinal = diretorAtual;
                }
            }
            resultado.add(diretorFinal);
        }
        diretoresContados.clear();
        return resultado;
    }
}
