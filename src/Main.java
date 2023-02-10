import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = null;
        List<String> slowa = new ArrayList<>();
        Map<String, Integer> mapa = new HashMap<>();
        int zapamietajLiczbe;
        List<String> listaAleTakaLadna = loadFileContent("C:/Users/sirk0/Desktop/cos.txt");
        for(int i = 0;i<listaAleTakaLadna.size();i++) {
            lista = Arrays.asList(listaAleTakaLadna.get(i).split(" "));
            for(int j = 0;j<lista.size();j++) {
                if (slowa.contains(lista.get(j))) {
                zapamietajLiczbe=mapa.get(lista.get(j));
                mapa.remove(lista.get(j));
                mapa.put(lista.get(j),zapamietajLiczbe+1);
                } else {
                    slowa.add(lista.get(j));
                    mapa.put(lista.get(j),1);
                }
            }
        }
        System.out.println(mapa);

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