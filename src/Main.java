import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //tu program główny
        System.out.println("Dzień dobry");

        //typy proste
        //pisane z małej litery, zmienne a nie obiekty -> nie mają pól i metod
        //typy całkowite
        byte liczba1 = 100;
        short liczba2 = 300;
        int liczba3 = 1234576;
        long liczba4 = 612564527;
        System.out.println("Twoja liczba " + liczba1);

        //typy zmiennoprzecinkowe, rzeczywiste , z ułamkiem
        float liczbaRzeczywista1 = 3.14f;//musi być na końcu f
        double liczbaRzeczywista2 = 23.456789;
        System.out.println("Liczba rzeczywista " + liczbaRzeczywista2);

        //typ logiczny
        boolean czyPrawda = true; //może być też false
        //typ znakowy
        char znak = 'a';


        /*
        Napisz program w którym wylosujesz liczbą z zakresu od 1 do 100
        Wpiszesz liczbe z klawiatury
        Powiesz czy ktoś zgadł wylosowaną
         */
        int wylosowanaLiczba = (int) (Math.random() * 100) + 1;
        System.out.println("Wylosowano " + wylosowanaLiczba);

        //wczytywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int zgadywanaLiczba = scanner.nextInt();
        System.out.println("Wpisano " + zgadywanaLiczba);
        //instrukcja warunkowa
        if (wylosowanaLiczba == zgadywanaLiczba) {
            System.out.println("Brawo trafione");
        } else {
            System.out.println("Moze nastepnym razem");
        }
        int roznica;
        if (wylosowanaLiczba > zgadywanaLiczba) {
            roznica = wylosowanaLiczba - zgadywanaLiczba;
        } else {
            roznica = zgadywanaLiczba - wylosowanaLiczba;
        }
        //wyrazenie warunkowe -> zwraca wartosc
        roznica = zgadywanaLiczba > wylosowanaLiczba ? zgadywanaLiczba - wylosowanaLiczba : wylosowanaLiczba - zgadywanaLiczba;
        roznica = roznica / 10; // dzielenie całkowite -> wynik całkowite bo dzielimy dwie liczby całkowite

        //instrukcja wyboru
        switch (roznica) {
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Dość blisko");
                break;
            case 2:
                System.out.println("Nie najgorzej");
                break;
            default:
                System.out.println("Sprobuj innym razem");

        }

        //wyrażenie switch
        //zwraca wartosć
        System.out.println(
                switch (roznica){
                    case 0 -> "Bardzo blisko";
                    case 1 -> "Dość blisko";
                    case 2 -> "Nie najgorzej";
                    default -> "Sprobuj innym razem";
                }
        );

        //zgadywanie 10 razy
        Random random = new Random();
        wylosowanaLiczba = random.nextInt(1,101);

        for (int i = 0; i < 10; i++) {
            System.out.println("Zgadnij liczbę");
            zgadywanaLiczba = scanner.nextInt();
            if(zgadywanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje to jest ta liczba");
                break;
            }
            if(zgadywanaLiczba>wylosowanaLiczba){
                System.out.println("Wpisano za dużo");
            }
            else {
                System.out.println("Wpisano za mało");
            }
        }

    }
}