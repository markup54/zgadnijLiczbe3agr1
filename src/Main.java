import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Wypisz wszystkie liczby dwucyfrowe parzyste
        System.out.println("Liczby dwucyfrowe  parzyste");
        for (int i = 10; i < 100; i=i+2) {
            System.out.print(i+", ");
        }
        System.out.println();
        //Zapytaj użytkownika ile chce gwiazdek i tyle mu napisz *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz gwaizdek?");
        int liczbaGwiazdek = scanner.nextInt();
        for (int i = 0; i < liczbaGwiazdek; i++) {
            System.out.print("*");
        }
        System.out.println();
        //Poproś uzytkownika o zero i wczytuj liczby tak długo aż będzie zero
        int liczbaWpisana;
        do{
            System.out.println("Podaj zero");
            liczbaWpisana = scanner.nextInt();
        }while (liczbaWpisana!=0);
        //Oblicz sumę wszystkich liczb od a do b
        //a i b wczytane z klawiatury

        int sumaLiczbOdAdoB = 0;
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbę");
        int b = scanner.nextInt();
        if(a<b){
        for (int i = a; i <=b ; i++) {
            sumaLiczbOdAdoB+=i;
        }
        }
        else {
            for (int i = a; i >=b ; i--) {
                sumaLiczbOdAdoB+=i;
            }
        }

        System.out.println("Suma liczb wynosi "+sumaLiczbOdAdoB);

        //czy liczba pierwsza
        boolean czyPierwsza = true;
        int liczba =scanner.nextInt();
        for (int i = 2; i < liczba; i++) {
            if(liczba%i ==0){
                czyPierwsza = false;
            }
        }
        if(czyPierwsza){
            System.out.println("to liczba pierwsza");
        }
        else{
            System.out.println("liczba złozona");
        }

    }
}
