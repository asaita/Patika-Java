import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fiz, kim, turkce, tar, muzik;
        double avarage;
        Scanner oku = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz");
        mat = oku.nextInt();

        System.out.print("Fizik Notunu Giriniz");
        fiz = oku.nextInt();

        System.out.print("Kimya Notunu Giriniz");
        kim = oku.nextInt();

        System.out.print("Türkçe Notunu Giriniz");
        turkce = oku.nextInt();

        System.out.print("Tarih Notunu Giriniz");
        tar = oku.nextInt();

        System.out.print("Müzik Notunu Giriniz");
        muzik = oku.nextInt();

        avarage = (mat + fiz + kim + turkce + tar + muzik) / 6.0;

        if (avarage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        } else {
            System.out.println("Malesef Sınıfta Kaldınız");

        }


        System.out.print("Ortalamanız" + avarage);
    }

}
