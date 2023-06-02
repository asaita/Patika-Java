import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {

        int heat;

        Scanner input =new Scanner(System.in);

        System.out.print("Hava Kaç derece? ");
        heat=input.nextInt();


        if(heat<5){
            System.out.println("Kayak Yap");

        } else if ((heat>=5)&&(heat<=15)) {
            System.out.println("Sinemaya Git");

        } else if ((heat>=15)&&(heat<=25)) {

            System.out.println("Piknik Yap");

        } else if (heat>25) {
            System.out.println("Yüzmeye git");
        }


    }
}
