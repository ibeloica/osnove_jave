package p18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {

//        2.Zad
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

        SlackMessage poruka1 = new SlackMessage();

        poruka1.tekst = "raspadam se";
        poruka1.imePrezime = "Paja Jaric";
        poruka1.datumVreme = "18052022 21:59";

        SlackMessage poruka2 = new SlackMessage();

        poruka2.tekst = "i ja";
        poruka2.imePrezime = "Zivota Nacic";
        poruka2.datumVreme = "18052022 22:00";

        System.out.println(poruka1.imePrezime + " - " + poruka1.datumVreme);
        System.out.println(poruka1.tekst);
        System.out.println(poruka2.imePrezime + " - " + poruka2.datumVreme);
        System.out.println(poruka2.tekst);




    }
}
