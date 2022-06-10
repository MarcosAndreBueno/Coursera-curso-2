package StepOneProject.testeDiretores;

import java.util.ArrayList;

public class MultiplosNomes {

    public ArrayList<String> temVirgula(String diretor, ArrayList<String> diretoresArrayCorrigido) {

        int startIndex = 0;
        diretoresArrayCorrigido = new ArrayList<String>();

        for (int i = 0; i < diretor.length(); i++) {

            if (!diretor.contains(",")) {
                diretoresArrayCorrigido.add(diretor);
                return diretoresArrayCorrigido;
            }

            if (diretor.substring(i, i+1).equals(",") && !(diretoresArrayCorrigido.contains(diretor.substring(startIndex, i)))) {
                diretoresArrayCorrigido.add(diretor.substring(startIndex, i));
                startIndex = i + 2;
                if (diretor.substring(startIndex).contains(",")) {
                    continue;
                } else {
                    if (!diretoresArrayCorrigido.contains(diretor.substring(startIndex, diretor.length()))) {
                        diretoresArrayCorrigido.add(diretor.substring(startIndex));
                        break;
                    }
                }
            }
        }
        return diretoresArrayCorrigido;
    }
}