
import java.util.Scanner;

public class TaksimetreProgrami {

    public static void main(String[] args) {

        int acilisUcreti=10,gidilenKM;
        double kmUcreti=2.20,ucret;

        Scanner oku = new Scanner(System.in);

        System.out.print("Kaç Kilometre Gittiniz ");
        gidilenKM= oku.nextInt();

        ucret=acilisUcreti+gidilenKM*kmUcreti;

        if(ucret<20){
            ucret=20;
        }

        System.out.println("Ödemeniz Gereken Ücret "+ucret);






    }

}
