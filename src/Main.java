import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witaj ponownie");

        int wylosowana = (int)(Math.random()*10+1);
        System.out.println(wylosowana);
        Scanner klawiatura = new Scanner(System.in);
    }
}
/*
typy proste:
logiczny - boolean
całkowite - byte, short, int, long
rzeczywiste - float, double
znakowy char

typy złożone zawsze pisane wielką literą
obiekty które mają własności i metody
 */