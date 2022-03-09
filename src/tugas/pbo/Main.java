package tugas.pbo;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static double pjg,lbr,tg,r;

    public static void main(String[] args) {
        boolean ulang = true;
        int y;
        int menu;
        while (ulang){
            menu = menu();
            switch (menu){
                case 1:
                    balok();
                    System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ?");
                    y = input.nextInt();
                    ulang = (y == 1);
                    break;
                case 2:
                    tabung();
                    System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ?");
                    y = input.nextInt();
                    ulang = (y == 1);
                    break;
                case 0:
                    ulang = false;
                    break;
            }
        }
    }
    
    public static int menu(){
        System.out.println("===========");
        System.out.println("MENU UTAMA");
        System.out.println("===========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.println("Pilih : ");
                        
        return input.nextInt();
    }

    public static void balok(){
        System.out.print("Input Panjang: " );
        pjg = input.nextDouble();
        System.out.print("Input Lebar: ");
        lbr = input.nextDouble();
        System.out.print("Input Tinggi: ");
        tg = input.nextDouble();

        Balok balok = new Balok(pjg,lbr,tg);

        balok.display();
    }

    public static void tabung(){
        System.out.print("Input Jari-Jari: " );
        r = input.nextDouble();
        System.out.print("Input Tinggi: ");
        tg = input.nextDouble();

        Tabung tabung = new Tabung(r,tg);
        tabung.display();
    }
}
