package StepOneProject.testeRaters;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;

import org.apache.commons.csv.CSVRecord;

import java.util.ArrayList;

public class ContarTodosRatersVotos {

    public ArrayList<String> conteTodos(CSVParser linhas, FileResource fr) {

        linhas = fr.getCSVParser();
        String raterAtual = "";
        ArrayList<String> ratersContados = new ArrayList<String>();
        ArrayList<String> ratersControle = new ArrayList<String>();
        ContarUmRaterVotos ativandoContarRater = new ContarUmRaterVotos();

        for (CSVRecord currentRow : linhas) {
            raterAtual = currentRow.get("rater_id");
            if (!ratersControle.contains(raterAtual)) {
                int count = ativandoContarRater.contar(linhas, fr, raterAtual);
                ratersContados.add("Rater id: " + raterAtual + " | quantidade de ratings: (" + count + ")");
                ratersControle.add(raterAtual);
            }
        }
        ratersControle.clear();
        return ratersContados;
    }
}