import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz ");
        double tutar=input.nextDouble();

        double kdvTutari,kdvDahilFiyat;

        kdvTutari=tutar*0.18;
        kdvDahilFiyat=kdvTutari+tutar;

        System.out.println("Kdv Tutarı "+kdvTutari);
        System.out.print("Kdv Dahil Fiyat "+kdvDahilFiyat);

    }
}
