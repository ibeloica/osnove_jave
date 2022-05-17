package p16_05_2022;

public class zadatak2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            StampaIme();
            StampaPrezime();

        }

//        Zadatak
//        Napisati dve metode, jedna metoda sluzi za stampanje imena
//        a druga sluzi za stampanje prezimena.
//        U glavnom programu pozvati metode na izvrsenje
//        tako da se 5 puta ispise ime i prezime u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic


    }

    static void StampaIme() {
        System.out.print("Ivan ");
    }

    static void StampaPrezime() {
        System.out.println("Beloica");
    }

}
