package Giris;
import java.util.Scanner;





public class GelismisHesapMakinesi {



    static int toplama(int n1,int n2) {

        return n1 + n2;

    }

    static int cikarma(int n1,int n2){

        return n1 - n2;
    }

    static int carpma(int n1,int n2){

        return n1*n2;
    }

    static int bolme (int n1,int n2){

        return n1/n2;
    }


    static int UsluSayi(int a, int b) {

        int toplam = 1;
        for (int i = 1; i <= b; i++) {


            toplam *= a;

        }
        return toplam;
    }

    static int faktoriyel(int a){

        int toplam = 1;
        for(int i=1; i<=a; i++){

            toplam = toplam * i;


        }
        return toplam;
    }



    static int kombinasyon(int a, int b){

        int toplam = 1;
        int toplam1 = 1;
        int toplam2 = 1;

        for (int i=1; i<=a; i++){
            toplam = toplam * i;
        }
        for (int j=1; j<=b; j++){
            toplam1 = toplam1 * j;
        }
        for (int k=1; k<=a-b; k++){
            toplam2 = toplam2 * k;
        }
        return toplam / (toplam1 * toplam2);


    }

    





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ : \n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme \n 5-Uslu Sayi \n 6-Faktoriyel \n 7-Kombinasyon");
        int secim;
        secim = input.nextInt();
        int a,b;

        System.out.print("Ilk Sayiyi Giriniz : ");
        a = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        b = input.nextInt();


        switch (secim) {

            case 1:
                System.out.print(toplama(a,b));
                break;
            case 2:
                System.out.print(cikarma(a,b));
                break;
            case 3:
                System.out.print(carpma(a,b));
                break;
            case 4:
                System.out.print(bolme(a,b));
                break;
            case 5:
                System.out.print(UsluSayi(a,b));
                break;
            case 6:
                System.out.print(faktoriyel(a));
                break;
            case 7:
                System.out.print(kombinasyon(a,b));
                break;


















        }
    }
}
