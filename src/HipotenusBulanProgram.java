import java.util.Scanner;

public class HipotenusBulanProgram {

    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner oku = new Scanner(System.in);

        System.out.print("a kenarını giriniz ");
        a= oku.nextInt();

        System.out.print("b kenarını giriniz ");
        b= oku.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs "+c);


    }
}
