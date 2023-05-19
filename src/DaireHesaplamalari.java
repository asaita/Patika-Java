import   java.util.Scanner;

public class DaireHesaplamalari {
    public static void main(String[] args) {

        double pi=3.14,alan,cevre,dilimAlan;
        int r,a;

        Scanner oku=new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz ");
        r=oku.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.print("Merkez Açısının Ölçüsünü Giriniz ");
        a=oku.nextInt();

        dilimAlan=(pi*r*r*a)/360;

        System.out.println("Dairenin Alanı "+alan);
        System.out.println("Dairenin Çevresi "+cevre);
        System.out.print("Dairenin Dilim Alanı "+dilimAlan);





    }
}
