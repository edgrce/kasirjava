import java.util.Scanner;

import javax.swing.JOptionPane;

public class tugasakhir1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int menu = 0;
        int angka1 = 0;
        int harga = 0;
        int angka2 = 0;
        int uang = 0;
        int kembalian = 0;
        int jumlah = 0;
        int total = 0;
        String nmenu;

        do {

          menu = Integer.parseInt(JOptionPane.showInputDialog(null,"=====SELAMAT DATANG DI WARUNG TAKOYAKI=====\n"
          + "Menu: \n1. Paket Hemat \n2. Menu  \n3. Selesai\n"
          + "Masukkan pilihan Anda: "));
          
            switch (menu) {
                case 1:
                angka1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                   " ======== MENU PAKET HEMAT ========\n"
                 + "-- Menu paket Makanan\n"
                 + "1. Paket sedang takoyaki      Rp.8.000\n"
                 + "2. Paket besar takoyaki         Rp.10.000\n"
                 + "3. Paket tahu lontong              Rp.22.000\n" 
                 + "4. Paket Rujak                           Rp.22.000\n"
                 + "--Menu paket Spesial\n"
                 + "5. Paket bareng pacar            Rp.10.000\n" 
                 + "6. Paket kumpul keluarga      Rp.15.000\n"
                 + "7. Paket friendly                       Rp.20.000\n"
                 + "8. Paket super kenyang          Rp.30.000\n =================================\n"
                 + "Pilih nomor yang akan anda pesan: "));
             
    
                 if (angka1 == 1) {
                     harga = 8000;
                     nmenu = "Besar Takoyaki";
                     JOptionPane.showMessageDialog(null, "Menu paket " + nmenu + " Memuat: \n- 5 biji takoyaki sosis \n- 10 biji takoyaki udang" + "\n- Harga: Rp." + harga);
                 } else if (angka1 == 2) {
                     harga = 10000;
                     nmenu = "Sedang Takoyaki";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 5 biji takoyaki sosis \n- 3 biji takoyaki udang" + "\n- Harga: Rp." + harga);
                 } else if (angka1 == 3) {
                     harga = 22000;
                     nmenu = "Tahu Lontong";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 3 piring tahu lontong" + "\n- Harga: Rp." + harga);
                 } else if (angka1 == 4) {
                     harga = 22000;
                     nmenu = "Rujak";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 3 Piring " + "\n- Harga: Rp." + harga);
                 } else if (angka1 == 5) {
                     harga = 10000;
                     nmenu = "Kumpul Keluarga";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 3 Cup Pop ice kecil \n- 7 biji takoyaki" + "\n- Harga Rp." + harga);
                 } else if (angka1== 6) {
                     harga = 15000;
                     nmenu = "Bareng pacar";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 2 Cup Pop ice kecil \n- 5 biji takoyaki" + "\n- Harga: Rp." + harga);
                 } else if (angka1 == 7) {
                     harga = 20000;
                     nmenu = "Friendly";
                     JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 1 Cup Pop  \n- 1 Rujak \n- 2 gorengan" + "\n- Harga Rp." + harga);
                 } else if (angka1 == 8) {
                     harga = 30000;
                     nmenu = "Super kenyang";
                    JOptionPane.showMessageDialog(null,"Menu paket " + nmenu + " Memuat: \n- 4  Cup Boba \n- 10 biji takoyaki" + "\n- Harga: Rp." + harga);
                 }  

                 jumlah = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa menu yang anda pesan? "));
                 total = jumlah * harga;
                 JOptionPane.showMessageDialog(null,"Total harga paket anda Rp." + total);
                 uang = Integer.parseInt(JOptionPane.showInputDialog(null,"Uang Anda: Rp."));
                 kembalian = uang - total;
                 JOptionPane.showMessageDialog(null,"Kembalian anda Rp." + kembalian);
                  
                 System.out.println("    PEMBAYARAN PAKET HEMAT    ");
                 System.out.println("====== MENU PAKET HEMAT =====\n"
                 + "-- Menu paket Makanan\n"
                 + "1. Paket sedang takoyaki      Rp.8.000\n"
                 + "2. Paket besar takoyaki       Rp.10.000\n"
                 + "3. Paket tahu lontong         Rp.22.000\n" 
                 + "4. Paket Rujak                Rp.22.000\n"
                 + "--Menu paket Spesial\n"
                 + "5. Paket bareng pacar         Rp.10.000\n" 
                 + "6. Paket kumpul keluarga      Rp.15.000\n"
                 + "7. Paket friendly             Rp.20.000\n"
                 + "8. Paket super kenyang        Rp.30.000\n"
                 + "=================================\n\n" );

                 System.out.println("<> Harga Paket Anda: Rp." + harga);
                 System.out.println("<> Jumlah paket yang anda beli: " + jumlah);
                 System.out.println("<> Total seluruh belanjaan anda: Rp." + total);
                 System.out.println("<> Uang tunai: Rp." + uang);
                 System.out.println("<> Kembalian: Rp." + kembalian);
                 break;

                case 2:
                 angka2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                   " =========== MENU ==========\n"
                 + "Makanan:                    \n"
                 + "1. Gorengan              Rp. 1.000\n"
                 + "2. Takoyaki sosis    Rp. 1.000\n" 
                 + "3. Takoyaki cumi     Rp. 2.000\n"
                 + "4. Rujak                      Rp. 8.000\n"
                 + "5. Tahu Lontong       Rp. 8.000\n"
                 + "Minuman:                    \n"
                 + "6. Es teh                      Rp. 3.000\n"
                 + "7. Kopi                         Rp. 3.000\n" 
                 + "8.Pop ice kecil           Rp. 3.000\n"
                 + "9.Pop ice besar         Rp. 5.000\n" 
                 + "10. Es jeruk                 Rp. 5.000\n"  
                 + "11.Boba                        Rp. 5.000\n"
                 + " ============================\n"
                 + "Masukkan nomor pilihan anda: "));
               

                 if (angka2 ==1) {
                     harga = 1000;
                 } else if (angka2 ==2) {
                     harga = 1000;   
                 } else if (angka2 ==3) {
                     harga = 2000;  
                 } else if (angka2 ==4) {
                     harga = 8000;  
                 } else if (angka2 ==5) {
                     harga = 8000;  
                 } else if (angka2 ==6) {
                     harga = 3000;
                 } else if (angka2 ==7) {
                     harga = 3000;   
                 } else if (angka2 ==8) {
                     harga = 3000; 
                 } else if (angka2 ==9) {
                     harga = 5000;
                 } else if (angka2 ==10) {
                     harga = 5000; 
                 } else if (angka2 ==11) {
                     harga = 5000;  
                 }

                 jumlah = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa menu yang anda pesan? "));
                 total = jumlah * harga;
                 JOptionPane.showMessageDialog(null,"Total harga paket anda Rp." + total);
                 uang = Integer.parseInt(JOptionPane.showInputDialog(null,"Uang Anda: "));
                 kembalian = uang - total;
                 JOptionPane.showMessageDialog(null,"Kembalian anda Rp." + kembalian);
                 
                 System.out.println("      PEMBAYARAN MENU      ");
                 System.out.println(" =========== MENU ==========\n" 
                 + "|Makanan:                    |\n" 
                 + "|1. Gorengan        Rp. 1.000|\n" 
                 + "|2. Takoyaki sosis  Rp. 1.000|\n"
                 + "|3. Takoyaki cumi   Rp. 2.000|\n"
                 + "|4. Rujak           Rp. 8.000|\n" 
                 + "|5. Tahu Lontong    Rp. 8.000|\n"
                 + "|Minuman:                    |\n"
                 + "|6. Es teh          Rp. 3.000|\n"
                 + "|7. Kopi            Rp. 3.000|\n" 
                 + "|8.Pop ice kecil    Rp. 3.000|\n" 
                 + "|9.Pop ice besar    Rp. 5.000|\n" 
                 + "|10. Es jeruk       Rp. 5.000|\n" 
                 + "|11.Boba            Rp. 5.000|\n"  
                 + " ============================ \n\n" );
                        
                 System.out.println("<> Harga Paket Anda: Rp." + harga);
                 System.out.println("<> Jumlah menu yang anda beli: " + jumlah);
                 System.out.println("<> Total seluruh belanjaan anda: Rp." + total);
                 System.out.println("<> Uang tunai: Rp." + uang);
                 System.out.println("<> Kembalian: Rp." + kembalian);
                 break;

                case 3:
                 JOptionPane.showMessageDialog(null, "Pembelian Berhasil!");
                 System.out.println("===TERIMAKASIH ATAS PEMBELIANNYA==="); 
                 break;
                }
                System.out.println("\n");
            }while (menu !=3);
    }
}
