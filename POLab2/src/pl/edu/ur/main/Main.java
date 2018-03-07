package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        System.out.println("Zrobilem zadanie ");

       // Scanner scan = new Scanner(System.in);

        boolean run = true;

//        while (run) {
//
//            int number = scan.nextInt();
//            switch (number) {
//                case 0:
//                    run = false;
//                case 1:
//                    System.out.println("Styczeń");
//                    break;
//                case 2:
//                    System.out.println("Luty");
//                    break;
//                default:
//                //System.out.println("Koniec");
//            }
//            System.out.println("Koniec");
//        }


        int i = 0;
        int a = 0;
        int skok = 1;

        do {
            a += skok;
            i+=1;
            System.out.println("a = "+a);
            System.out.println("obieg petli numer "+(i));
        } while (a < 1000);
        
        a = 0;
        i = 0;
        
        while(a < 1000){
            a += skok;
            i+=1;
            System.out.println("a = "+a);
            System.out.println("obieg petli numer "+(i));
        }
    }

}
