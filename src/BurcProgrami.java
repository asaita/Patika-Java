import  java.util.Scanner;
public class BurcProgrami {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int month,day;
        String burc="";
        Boolean isError=false;

        System.out.print("Hangi ayda doğdunuz ");
        month=input.nextInt();

        System.out.print("Hangi günde doğdunuz ");
        day=input.nextInt();

        if(month==1){
            if((day>=1)&&(day<=21)){

                burc="Oğlak Burcu";
                
            } else if ((day>21)&&(day<=31)) {

                burc="Kova Burcu";

            }else{

                isError=true;

            }

        } else if (month==2) {

            if((day>=1)&&(day<=19)){

                burc="Kova Burcu";

            } else if ((day>19)&&(day<=28)) {

                burc="Balık Burcu";

            }else{

                isError=true;

            }

        } else if (month==3) {
            if((day>=1)&&(day<=20)){

                burc="Balık Burcu";

            } else if ((day>19)&&(day<=30)) {

                burc="Koç Burcu";

            }else{

                isError=true;

            }

        } else if (month==4) {
            if((day>=1)&&(day<=20)){

                burc="Koç Burcu";

            } else if ((day>19)&&(day<=30)) {

                burc="Boğa Burcu";

            }else{

                isError=true;

            }

        } else if (month==5) {
            if((day>=1)&&(day<=21)){

                burc="Boğa Burcu";

            } else if ((day>21)&&(day<=31)) {

                burc="İkizler Burcu";

            }else{

                isError=true;

            }

        } else if (month==6) {
            if((day>=1)&&(day<=22)){

                burc="İkizler Burcu";

            } else if ((day>22)&&(day<=30)) {

                burc="Yengeç Burcu";

            }else{

                isError=true;

            }

        } else if (month==7) {
            if((day>=1)&&(day<=22)){

                burc="Yengeç Burcu";

            } else if ((day>22)&&(day<=30)) {

                burc="Aslan Burcu";

            }else{

                isError=true;

            }

        } else if (month==8) {
            if((day>=1)&&(day<=22)){

                burc="Aslan Burcu";

            } else if ((day>22)&&(day<=30)) {

                burc="Başak Burcu";

            }else{

                isError=true;

            }

        } else if (month==9) {
            if((day>=1)&&(day<=22)){

                burc="Başak Burcu";

            } else if ((day>22)&&(day<=30)) {

                burc="Terazi Burcu";

            }else{

                isError=true;

            }

        } else if (month==10) {
            if((day>=1)&&(day<=23)){

                burc="Terazi Burcu";

            } else if ((day>23)&&(day<=30)) {

                burc="Akrep Burcu";

            }else{

                isError=true;

            }

        } else if (month==11) {
            if((day>=1)&&(day<=21)){

                burc="Akrep Burcu";

            } else if ((day>21)&&(day<=30)) {

                burc="Yay Burcu";

            }else{

                isError=true;

            }

        } else if (month==12) {
            if((day>=1)&&(day<=22)){

                burc="Yay Burcu";

            } else if ((day>22)&&(day<=30)) {

                burc="Oğlak Burcu";

            }else{

                isError=true;

            }

        }else{
            isError=true;
        }

        if(isError){
            System.out.println("Yanlış değer girdiniz");
        }else{
            System.out.println("Burcunuz "+burc);
        }


    }
}
