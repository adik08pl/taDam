import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        List<String> listaAleTakaLadna = loadFileContent("C:/Users/Bob/Desktop/do Javy/cool.txt");
        System.out.println(loadFileContent("C:/Users/Bob/Desktop/do Javy/cool.txt").size());
        for(int i = 0;i<listaAleTakaLadna.size();i++){
            List<String> lista = Arrays.asList(listaAleTakaLadna.get(i).split(" "));
           slowa.addAll(lista);
           System.out.println(lista);
        }
    }
    public static List<String> loadFileContent(String filePath) {
        try {
            List<String> result = Files.readAllLines(Path.of(filePath));
            return result;
        } catch (IOException e) {
            return null;
        }
    }
}