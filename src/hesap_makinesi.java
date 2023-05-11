import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        int a,b,select;

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.print("İşlemi Seçiniz : \ntoplama = 1\nçıkarma = 2\nçarpma = 3\nbölme = 4\n ----> ");
        select=input.nextInt();


        switch (select){
            case 1:
                System.out.println("İşlem Sonucu : "+(a+b));
                break;
            case 2:
                System.out.println("İşlem Sonucu : "+(a-b));
                break;
            case 3:
                System.out.println("İşlem Sonucu : "+(a*b));
                break;
            case 4:
                System.out.println("İşlem Sonucu : "+(a/b));
                break;
        }

    }

}
