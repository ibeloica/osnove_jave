package vezbanjeForPetlje2904;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        7. Napisati program koji sumira brojeve od 1 do 10 i na kraju programa ispisuje sumu.
//        suma = 1 + 2 + 3 + … + 10;

        int suma = 0;

        for (int i = 0; i <= 10; i++) {
            suma = suma + i;


        }System.out.println("Suma je " + suma);



    }
}
