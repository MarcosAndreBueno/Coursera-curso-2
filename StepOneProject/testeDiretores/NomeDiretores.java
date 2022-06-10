package StepOneProject.testeDiretores;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.util.ArrayList;

public class NomeDiretores {

    public ArrayList<String> diretoresArray(CSVParser linhas) {
        ArrayList<String> diretoresArray = new ArrayList<>();
        String diretor;
        String filme;

        //Procurando se tem mais de um nome na linha.
        ArrayList<String> diretoresArrayCorrigido = new ArrayList<String>();
        MultiplosNomes ativandoBusca = new MultiplosNomes();

        for (CSVRecord currentRow : linhas) {
            diretor = currentRow.get("director");
            diretoresArray = ativandoBusca.temVirgula(diretor, diretoresArrayCorrigido);
            for (int i = 0; i < diretoresArray.size(); i++) {
                diretor = diretoresArray.get(i);
                diretoresArrayCorrigido.add(diretor);
            }
        }
        diretoresArray.clear();
        return diretoresArrayCorrigido;
    }
}

