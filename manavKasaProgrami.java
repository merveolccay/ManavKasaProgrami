package java101;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKilo =2.14;
        double elmaKilo = 3.67;
        double domatesKilo = 1.11;
        double muzKilo = 0.95;
        double patlicanKilo = 5.0;

        System.out.println("Kaç kilo armut istersiniz: ");
        double armut = input.nextDouble();
        System.out.println("Kaç kilo elma istersiniz: ");
        double elma = input.nextDouble();
        System.out.println("Kaç kilo domates istersiniz: ");
        double domates = input.nextDouble();
        System.out.println("Kaç kilo muz istersiniz: ");
        double muz = input.nextDouble();
        System.out.println("Kaç kilo patlıcan istersiniz: ");
        double patlican = input.nextDouble();

        double tutar = armutKilo*armut + elmaKilo*elma + domatesKilo*domates + muzKilo*muz + patlicanKilo*patlican;

        System.out.println("Toplam Tutar: " + tutar);
    }
}
