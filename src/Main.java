import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> ListA = new ArrayList<>();
        System.out.println(ListA);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write five word for list A ");

        for (int i = 0; i < 5; i++) {
            ListA.add(scanner.next());
        }
        System.out.println("ListA: "+ListA);

        ArrayList<String>ListB = new ArrayList<>();
        System.out.println("Write five word for list B ");



        for (int i = 0; i < 5; i++) {

            ListB.add(scanner.next());
        }
        System.out.println(" ListB: " + ListB);

        ArrayList<String> ListC = new ArrayList<>();
        Collections.reverse(ListB);
        System.out.println("reversed list b: " + ListB);
        for (int i = 0; i < 5; i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(i));
        }
        System.out.println( "ListC: + " + ListC);
        Collections.sort(ListC, Comparator.comparing(String :: length));
        System.out.println("Сортировка по длине строк " + ListC);

    }
}