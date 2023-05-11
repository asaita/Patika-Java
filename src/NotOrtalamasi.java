import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat,fiz,kim,turkce,tar,muzik;
        double ort;
        Scanner oku =new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz");
        mat=oku.nextInt();

        System.out.print("Fizik Notunu Giriniz");
        fiz=oku.nextInt();

        System.out.print("Kimya Notunu Giriniz");
        kim=oku.nextInt();

        System.out.print("Türkçe Notunu Giriniz");
        turkce=oku.nextInt();

        System.out.print("Tarih Notunu Giriniz");
        tar=oku.nextInt();

        System.out.print("Müzik Notunu Giriniz");
        muzik=oku.nextInt();

        ort=(mat+fiz+kim+turkce+tar+muzik)/6;


        System.out.print("Ortalamanız"+ort);

        String sonuc=ort>=60?"Geçtiniz":"Kaldınız";

        System.out.print(sonuc);

    }
}
