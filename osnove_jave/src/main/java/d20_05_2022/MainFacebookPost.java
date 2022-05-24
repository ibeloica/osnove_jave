package d20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost("Dragan", "Milan", "Kad ce ti zadaci?", 5, 10);
        FacebookPost post2 = new FacebookPost("Milan", "Dragan", "Polako", 5, 10);


        post1.like();
        post1.dislike();
        post1.share();
        post1.print();

        System.out.println();



        post2.like();
        post2.share();
        post2.dislike();
        post2.print();


    }
}
