import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnimalesJsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File animalesJsonfile = new File("src/main/resources/animales.json");

        List<Animales> animales = objectMapper.readValue(animalesJsonfile, new TypeReference<List<Animales>>() {});

        for(Animales animalesN: animales){
            System.out.println(animalesN.getNombre());
            System.out.println(animalesN.getVida());
            System.out.println(animalesN.getNombreAtaques());
            System.out.println(animalesN.getAtaques());
            System.out.println("______________________");
        }






    }
}
