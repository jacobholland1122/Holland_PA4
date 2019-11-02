import java.io.IOException;

public class Application {


    public static void main(String[] args) throws IOException {

        String dataFile = "problem1.txt";
        String outputFile = "unique_words.txt";

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        duplicateRemover.remove(dataFile);
        duplicateRemover.write(outputFile);
    }

}

