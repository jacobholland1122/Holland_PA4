import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {

    private HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) {

        try {

            FileInputStream fileInputStream = null;
            Scanner scanner = null;

            fileInputStream = new FileInputStream(dataFile);
            scanner = new Scanner(fileInputStream);

            while(scanner.hasNext()) {

                uniqueWords.add(scanner.next());

            }

            scanner.close();
            fileInputStream.close();

        }

        catch (IOException exception){

            exception.printStackTrace();

        }
    }

    public void write(String outputFile) throws IOException {

        try {

            FileOutputStream fileOutputStream = null;
            PrintWriter printWriter = null;

            fileOutputStream = new FileOutputStream(outputFile);
            printWriter = new PrintWriter(fileOutputStream);

            for(String string : uniqueWords) {

                printWriter.println(string);

            }

            fileOutputStream.close();
            printWriter.flush();
        }

        catch(Exception exception) {

            exception.printStackTrace();

        }
    }
}


