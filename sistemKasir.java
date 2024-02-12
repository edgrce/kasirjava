
import java.util.Scanner;

public class sistemKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Takoyaki yang dibeli: ");
        int menu1 = input.nextInt();

        System.out.print("Pop ice yang dibeli: ");
        int menu2 = input.nextInt();

        System.out.print("Gorengan yang dibeli: ");
        int menu3 = input.nextInt();

        System.out.print("Boba yang dibeli: ");
        int menu4 = input.nextInt();

        System.out.print("Rujak yang dibeli: ");
        int menu5 = input.nextInt();

        System.out.print("Tahu Lontong yang dibeli: ");
        int menu6 = input.nextInt();

        System.out.print("Uang Tunai: ");
        int uang = input.nextInt();

        int takoyaki = menu1 * 1000;
        int popIce = menu2 * 3000;
        int gorengan = menu3 * 1000;
        int boba = menu4 * 5000;
        int rujak = menu5 * 8000;
        int tahuLontong = menu6 * 8000;
        int total = takoyaki + popIce + gorengan + boba 
        + rujak + tahuLontong;
        int kembalian = uang - total; 

        System.out.println("\n===PEMBAYARAN TOKO TAKOYAKI===\n");
        System.out.println("Takoyaki    : " + "Rp" + takoyaki);
        System.out.println("Popice      : " + "Rp" + popIce);
        System.out.println("Gorengan    : " + "Rp" + gorengan);
        System.out.println("Boba        : " + "Rp" + boba);
        System.out.println("Rujak       : " + "Rp" + rujak);
        System.out.println("Tahu lontong: " + tahuLontong);
        System.out.println("Total       : " + total);
        System.out.println("_______________________+");
        System.out.println("Uang Tunai  : " + uang);
        System.out.println("Kembalian   : " + kembalian);
        System.out.println("\n ======TERIMAKASIH====== \n");













    }
}
