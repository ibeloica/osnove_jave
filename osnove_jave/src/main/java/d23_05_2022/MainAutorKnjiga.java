package d23_05_2022;

public class MainAutorKnjiga {
    public static void main(String[] args) {

//        U glavnom programu napraviti vise autora sa vise knjiga.

        Autor autor1 = new Autor();
        autor1.setIme("Nil");
        autor1.setPrezime("Gejmen");
        Autor autor2 = new Autor();
        autor2.setIme("Teri");
        autor2.setPrezime("Pracet");
        Autor autor3 = new Autor();
        autor3.setIme("Ticijano");
        autor3.setPrezime("Sklavi");

        Knjiga knjiga1 = new Knjiga();
        knjiga1.setISBN("1234567");
        knjiga1.setNaziv("Nikadodjija");
        knjiga1.setAutor(autor1);
        knjiga1.setGodinaIzdanja(1996);

        Knjiga knjiga2 = new Knjiga();
        knjiga2.setISBN("345678");
        knjiga2.setNaziv("Diskworld");
        knjiga2.setAutor(autor2);
        knjiga2.setGodinaIzdanja(1983);

        Knjiga knjiga3 = new Knjiga();
        knjiga3.setISBN("666666");
        knjiga3.setNaziv("Dilan Dog");
        knjiga3.setAutor(autor3);
        knjiga3.setGodinaIzdanja(1986);

        knjiga1.print();
        System.out.println();
        knjiga2.print();
        System.out.println();
        knjiga3.print();
        System.out.println();
        System.out.println("K R A J");

    }
}
