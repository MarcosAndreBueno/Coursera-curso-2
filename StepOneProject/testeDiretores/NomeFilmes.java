package StepOneProject.testeDiretores;

import java.util.ArrayList;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class NomeFilmes {

    public ArrayList<String> nomeFilme(CSVParser linhas, FileResource fr) {
        linhas = fr.getCSVParser();
        String id = "";
        String title = "";
        ArrayList<String> filmes = new ArrayList<>();

        for (CSVRecord currentRow : linhas) {
            id = (currentRow.get("id"));
            title = (currentRow.get("title"));
            filmes.add("Id"+id+" | Filme: "+title);
        }

        return filmes;
    }
}