import  java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        int num1,num2,select;

        Scanner input =new Scanner(System.in);

        System.out.print("1. sayıyı Giriniz ");
        num1=input.nextInt();

        System.out.print("2. sayıyı Giriniz ");
        num2=input.nextInt();

        System.out.println("\n1-Toplama \n 2-Çıkarma \n 3-Bölme \n 4-Çarpma");

        select=input.nextInt();

        switch (select){
            case 1 :
                System.out.print("= "+(num1+num2));
                break;
            case 2 :
                System.out.print("= "+(num1-num2));
                break;
            case 3 :
                if(num2!=0) {
                    System.out.print("= " + (num1 / num2));
                }else{
                    System.out.print("O'a bölme işlemi gerçekleştirilemez");
                }
                break;
            case 4 :
                System.out.print("= "+(num1*num2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;

        }

    }
}
