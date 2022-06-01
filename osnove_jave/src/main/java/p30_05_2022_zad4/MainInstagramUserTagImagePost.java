package p30_05_2022_zad4;

import java.util.ArrayList;

public class MainInstagramUserTagImagePost {
    public static void main(String[] args) {

        InstagramUser atributko = new InstagramUser("Atributko", "Mile Ilic",
                "profa@gmail.com");

        InstagramTag tag1 = new InstagramTag(35, 20, atributko);
        InstagramTag tag2 = new InstagramTag(36, 21, atributko);
        InstagramTag tag3 = new InstagramTag(37, 22, atributko);

        ArrayList nizTagova = new ArrayList<>();
        nizTagova.add(tag1);
        nizTagova.add(tag2);
        nizTagova.add(tag3);

        InstagramImage slika1 = new InstagramImage(nizTagova, "640*480", "imgur/slika1.jpg");
        InstagramImage slika2 = new InstagramImage(nizTagova, "320*200", "imgur/slika2.jpg");
        InstagramImage slika3 = new InstagramImage(nizTagova, "800*600", "imgur/slika3.jpg");

        ArrayList nizSlika = new ArrayList<>();
        nizSlika.add(slika1);
        nizSlika.add(slika2);
        nizSlika.add(slika3);

        InstagramPost post1 = new InstagramPost(nizSlika, "bas lep post");

        atributko.stampaj();
        slika1.stampaj();
        tag1.stampaj();
        post1.stampaj();









    }

}
