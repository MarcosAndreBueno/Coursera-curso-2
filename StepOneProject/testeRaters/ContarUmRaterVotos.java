package StepOneProject.testeRaters;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import edu.duke.FileResource;

public class ContarUmRaterVotos {

    public int contar(CSVParser linhas, FileResource fr, String raterAtual) {
        String raterComparando = "";
        int count = 0;
        linhas = fr.getCSVParser(); //**
        for (CSVRecord currentRow : linhas) {
            raterComparando = currentRow.get("rater_id");
            if (raterAtual.equals(raterComparando)) {
                count += 1;
            }
        }
        return count;
    }
}

        /*O comando getCSVParser necessita ser resetado.
        talvez pq, após a primeira execução, quando o programa retornar, ele vai entender que a variável linha
        já atingiu o valor final do arquivo (ou seja, a última linha).
        Com isso, quando usado de novo o comando iniciará da última linha, e só ela será iterada.
        Obviamente não é isso que queremos, logo resetamos.
        */