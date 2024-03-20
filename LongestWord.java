import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            String longestWord = "";

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            reader.close();

            System.out.println("Самое длинное слово в файле: " + longestWord);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}