

import java.util.Scanner;


public class etkinlik {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık kaç derece?");

        double sicaklik = input.nextDouble();

        if (sicaklik<5){

            System.out.println("Kayak yapmak ister misiniz?");}

         if ( sicaklik>= 5 && sicaklik<=10 ){

            System.out.println("Sinema?");}

         if ( sicaklik>=10 && sicaklik<= 15) {


             System.out.println("Piknik?");
             System.out.println("Sinema?");
         }
        if ( sicaklik>= 15 && sicaklik<=25 ) {

            System.out.println("Piknik?");


        }
         if ( sicaklik>=25 ){


            System.out.println("Yüzme?");}











    }


}
