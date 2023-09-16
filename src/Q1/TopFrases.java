package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class TopFrases {

    public static void main(String[] args) throws IOException {
        Stack pilha = new Stack();
        Scanner sc;

        sc = new Scanner(new File("C:\\Users\\12116809\\IdeaProjects\\EstruturaDados3\\src\\Q1\\arquivo\\exercicio3.txt"));

        while (sc.hasNextLine()) {
            pilha.push(sc.nextLine());
        }

        for (int i =0; i < 10; i++) {
            System.out.println(pilha.pop());
        }
    }
}
