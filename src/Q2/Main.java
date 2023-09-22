package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String ingressos = "C:\\Users\\12116809\\IdeaProjects\\EstruturaDados3\\src\\Q2\\arquivo\\ingresso.txt";

        List<String> fila = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(ingressos))) {
            while (sc.hasNextLine()) {
                fila.add(sc.nextLine());
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Os ingressos VIP's são: " + fila.remove(0));
        }

        //pega um numero randomico
        int conhecerBanda = new Random().nextInt(fila.size());

        System.out.println("Pessoa de Sorteada para conhecer a banda: " + fila.remove(conhecerBanda));
    }
}
