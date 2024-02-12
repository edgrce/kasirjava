import java.util.Scanner;

import javax.swing.JOptionPane;

public class kasirtakoyaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI WARUNG TAKOYAKI!");
        String nama = JOptionPane.showInputDialog(null, "Atas Nama?");
        JOptionPane.showMessageDialog(null, "====WARUNG TAKOYAKI==== \n" + "\nMenu: \n" 
        + "~ Makanan: \n"
        + "1) Takoyaki             Rp.1.000\n"
        + "2) Gorengan            Rp.1.000\n"
        + "3) Rujak                    Rp.8.000\n"
        + "4) Tahu Lontong     Rp.8.000\n\n"
        + "~ Minuman: \n"
        + "5) Pop Ice                 Rp.3.000\n"
        + "6) Kopi                       Rp.3000\n"
        + "7) Boba                      Rp.5.000\n"
        + "========================");

        String awal = JOptionPane.showInputDialog("Anda ingin memesan makanan? \n ya/tidak\n ");

        int makanan = 0;
        int makanan1 = 0;
        int minuman = 0;
        int minuman1 = 0;
        int harga = 0;

        if (awal.equals("ya")) {

        makanan = Integer.parseInt(JOptionPane.showInputDialog( "============" + "\n1. Takoyaki \n 2. Gorengan \n 3. Rujak \n 4. Tahu Lontong \n============ \n " 
        + "Silahkan pilih nomor makanan yang akan anda beli:      "));

        int jumlah1 = Integer.parseInt(JOptionPane.showInputDialog("\nBerapa jumlah makan yang anda pesan? \n  "));
        if (makanan ==1) {
           harga = 1000;
        } else if (makanan ==2) {
           harga = 1000;
        } else if (makanan ==3) {
            harga = 8000;  
        } else if (makanan ==4){
            harga = 8000;
        }
         
         

        String tengah = JOptionPane.showInputDialog("Apakah anda ingin memesan menu makanan yang lain? \n ya / tidak\n");
   
        if (tengah.equals("ya")) {

        makanan1 = Integer.parseInt(JOptionPane.showInputDialog( "============" + "\n1. Takoyaki \n 2. Gorengan \n 3. Rujak \n 4. Tahu Lontong \n============ \n " 
        + "Silahkan pilih nomor makanan yang akan anda beli:      "));

        int jumlah3 = Integer.parseInt(JOptionPane.showInputDialog("\nBerapa jumlah makan yang anda pesan? \n  "));
        if (makanan1 ==1) {
           harga = 1000;
        } else if (makanan1 ==2) {
           harga = 1000;
        } else if (makanan1 ==3) {
            harga = 8000;  
        } else if (makanan1 ==4){
            harga = 8000;
        }

        int jmenu = jumlah1 + jumlah3;
        int totalM = jumlah1 * harga;
        int totalM1 = jumlah3 * harga;
        int totalS = totalM + totalM1;

        JOptionPane.showMessageDialog(null, "Total harga makanan anda adalah: " + totalS);
        
        String akhir = JOptionPane.showInputDialog("Apakah anda akan memesan minuman? \n ya/tidak");
       
        if (akhir.equals("ya")) {
          
        minuman = Integer.parseInt((JOptionPane.showInputDialog( "=========\n" + " 5. Pop ice \n 6. Kopi \n 7. Boba \n=========" + "\nsilahkan pilih nomor minuman yang anda pesan: \n    ")));
          
        int jumlah2 = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah minum yang anda pesan? \n  "));
     
        if (minuman >= 5 && minuman <= 6) {
           harga = 3000;
        } else if (minuman == 7) {
            harga = 5000;
        }

        String tengah1 = JOptionPane.showInputDialog(null, "Anda ingin menambah minuman lagi? \n ya/tidak\n");

        if (tengah1.equals("ya")) {
            minuman1 = Integer.parseInt((JOptionPane.showInputDialog( "=========\n" + " 5. Pop ice \n 6. Kopi \n 7. Boba \n=========" + "\nsilahkan pilih nomor minuman yang anda pesan: \n    ")));
          
        int jumlah4 = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah minum yang anda pesan? \n  "));
     
        if (minuman1 == 5 && minuman1 == 6) {
           harga = 3000;
        } else if (minuman1 == 7) {
            harga = 5000;
        }
        
        int totalg = jumlah2 + jumlah4;
        int totalG = harga * jumlah2;
        int totalG1 = harga * jumlah4;
        int totalGS = totalG + totalG1;

        JOptionPane.showMessageDialog(null, "Total harga minuman anda adalah: " + totalGS);
        
        int uang = Integer.parseInt(JOptionPane.showInputDialog("Uang anda: Rp."));
       
        System.out.println(" ============KASIR===========\n"
         + "|Makanan:                    |\n"
         + "|1. Takoyaki        Rp. 1.000|\n"
         + "|2. Gorengan        Rp. 1.000|\n" 
         + "|3. Rujak           Rp. 8.000|\n"
         + "|4. Tahu Lontong    Rp. 8.000|\n"
         + "|Minuman:                    |\n" 
         + "|5. Pop ice         Rp. 3.000|\n" 
         + "|6. Kopi            Rp. 3.000|\n"
         + "|7. Boba            Rp. 5.000|\n"
         + " ============================\n");

         System.out.println("# Menu makanan anda: \nNomor: " + makanan + " dan " + makanan1 
         + "\n# Jumlah makanan yang anda pesan: \n"
         + "Makanan 1: " + jumlah1 + " Porsi\n" 
         + "Makanan 2: " + jumlah3 + " Porsi\n"
         + "Total Porsi : " + jmenu + " Porsi\n"
         + "# Harga Rp." + totalS);

         System.out.println("\n# Menu minuman anda: \nNomor: " + minuman + " dan " + minuman1
         + "\n# Jumlah minuman yang anda pesan: \n"
         + "Minuman 1: " + jumlah2 + " Gelas\n"
         + "Minuman 2: " + jumlah4 + " Gelas\n"
         + "Total gelas: " + totalg + " Gelas\n"
         + "# Harga Rp." + totalGS);

        int seluruhnya = totalS + totalGS;
        int kembalian = uang - seluruhnya;
        System.out.println("\n===PEMBAYARAN WARUNG TAKOYAKI===\n"
        + "\nUang anda sebesar: Rp. " + uang
        + "\nTotal seluruh belanjaan anda: Rp. " + seluruhnya 
        + "\nKembalian anda: " + "Rp. " + kembalian
        + "\n\n===TERIMAKASIH KEPADA " + nama + " TELAH BERBELANJA===");
   

    } else {
        JOptionPane.showMessageDialog( null, "Maaf, Tidak ada dalam menu kami.");
}
}
}  
}
    }
}


