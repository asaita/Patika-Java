import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName,password;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz ");
        userName=input.nextLine();

        System.out.print("Şifre giriniz ");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Başarı ile giriş yaptınız");
        }else{
            System.out.println("Yanlış kullanıcı adı veya şifre");
        }



    }
}
