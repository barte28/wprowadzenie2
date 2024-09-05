import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witaj ponownie");

        int wylosowana = (int)(Math.random()*100+1);
        System.out.println(wylosowana);

        System.out.println("Zgadnij liczbe z zakresu od 1 do 10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();
        System.out.println("Wpisano z klawiatury: "+wpisanaLiczba);

        if(wpisanaLiczba == wylosowana){
            System.out.println("Trafiona liczba");
        }
        else{
            System.out.println("Nie trafiono spróbuj ponownie");
        }
        //wyrażenie warunkowe, : to else
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie":"Niepoprawnie";
        System.out.println(komunikat);

        int roznica = wylosowana>wpisanaLiczba ? wylosowana - wpisanaLiczba:wpisanaLiczba-wylosowana;
        roznica = roznica/10;//dzielenie całkowite bo wynik typu int
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("Brawo");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("Spróbuj szczęścia kiedy indziej");
        }
        //wyrażenie switch
        System.out.println(
                switch (roznica){
                    case 0 -> "Brawo";
                    case 1 -> "Bardzo blisko";
                    case 2 -> "Dość blisko";
                    default -> "słabo";
                }
        );

        //zgadywanie 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Zgadnij liczbę, próba nr"+(i+1));
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowana){
                System.out.println("Wygrana");
                break;
            }
            else {
                if (wpisanaLiczba>wylosowana){
                    System.out.println("Wpisano za dużo");
                }
                else {
                    System.out.println("Wpisano za mało");
                }
            }

        }
        //zgadywanie do skutku
        System.out.println("Zgadnij liczbę");
        wpisanaLiczba = klawiatura.nextInt();
        while (wpisanaLiczba != wylosowana){
            if (wpisanaLiczba>wylosowana){
                System.out.println("Wpisano za dużo");
            }
            else {
                System.out.println("Wpisano za mało");
            }
            System.out.println("Zgadnij liczbę");
            wpisanaLiczba = klawiatura.nextInt();
        }
        System.out.println("Gratulacje wygrana");
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