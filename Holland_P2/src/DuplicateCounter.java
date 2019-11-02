import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

    private HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) {

        try {

            FileInputStream fileInputStream = null;
            Scanner scanner = null;

            String string;
            fileInputStream = new FileInputStream(dataFile);
            scanner = new Scanner(fileInputStream);

            while(scanner.hasNext()) {

                string = scanner.next();

                if(!wordCounter.containsKey(string)) {

                    wordCounter.put(string, 1);

                }
                else {

                    wordCounter.put(string, wordCounter.get(string) + 1);

                }
            }

            scanner.close();
            fileInputStream.close();

        }

        catch(IOException exception) {

            exception.printStackTrace();

        }
    }

    public void write(String outputFile) {

        try {

            FileOutputStream fileOutputStream = null;
            PrintWriter printWriter = null;

            fileOutputStream = new FileOutputStream(outputFile);
            printWriter = new PrintWriter(fileOutputStream);

            for(String key : wordCounter.keySet()) {

                printWriter.println(wordCounter.get(key));

            }

            printWriter.flush();
            fileOutputStream.close();
        }

        catch(IOException exception) {

            exception.printStackTrace();
        }
    }

}

