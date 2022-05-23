package d20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        FacebookPost post2 = new FacebookPost();

        post1.posiljaoc = "Dragan";
        post1.primaoc = "Milan";
        post1.tekst = "Kad ce ti zadaci?";
        post1.brojLajkova = 5;
        post1.brojDeljenja = 10;

        post1.like();
        post1.dislike();
        post1.share();
        post1.print();

        System.out.println();

        post2.posiljaoc = "Milan";
        post2.primaoc = "Dragan";
        post2.tekst = "Polako";
        post2.brojLajkova = 5;
        post2.brojDeljenja = 10;

        post2.like();
        post2.share();
        post2.dislike();
        post2.print();


    }
}
