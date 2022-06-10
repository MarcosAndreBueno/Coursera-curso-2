package StepOneProject.testeDiretores;

import java.util.*;

public class ContarQuantasVezesApareceu {

    public ArrayList<String> contar(ArrayList<String> diretoresArray) {
        int count = 0;
        int maiorAteEntao = 0;
        ArrayList<String> diretoresContados = new ArrayList<>();

        for (int i = 0; i < diretoresArray.size(); i++) {
            String diretorAtual = diretoresArray.get(i);
            count = 0;
            for (int j = 0; j < diretoresArray.size(); j++) {
                if (diretorAtual.equals((diretoresArray.get(j)))
                        && (!diretoresContados.contains(diretorAtual))) {
                    count += 1;
                }
            }
            diretoresContados.add("Diretor: " + diretorAtual + " (" + count + ")");
        }
        return diretoresContados;
    }
}