package StepOneProject.testeRaters;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import edu.duke.FileResource;

public class EncontrarQuantidadeRaters {


    public int encontrarQuantidadeRaters(CSVParser linhas, FileResource fr) {
        String raterAtual;
        int quantidadeRaters = 0;

        for (CSVRecord currentRow : linhas) {
            raterAtual = currentRow.get("rater_id");
            if (raterAtual != "") {
                quantidadeRaters += 1;
            }
        }
        return quantidadeRaters;
    }
}