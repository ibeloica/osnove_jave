package TestJavaKlase0606;

public class MainInstagramusa {
    public static void main(String[] args) {


        InstagramUser iu1 = new InstagramUser("brljca", "Mile Ilic");
        InstagramUser iu2 = new InstagramUser("lerma", "Mare Maric");
        InstagramUser iu3 = new InstagramUser("paja", "Pavle Pekic");

        InstagramLocationAddOn il1 = new InstagramLocationAddOn("123", 2, 5,
                10, 20, "goreLevo");
        InstagramLocationAddOn il2 = new InstagramLocationAddOn("456", 4, 6,
                11, 24, "goreDesno");
        InstagramLocationAddOn il3 = new InstagramLocationAddOn("789", 7, 9,
                18, 32, "doleLevo");

        InstagramMentionAddOn im1 = new InstagramMentionAddOn("987", 5, 7,
                12, 19, iu1);

        InstagramStory is1 = new InstagramStory(iu2, "www.google.com",
                "https://www.instagram.com/p/CecrcPyrPMj/" );

        is1.postaviStory();
    }
}
