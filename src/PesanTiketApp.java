import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();
        System.out.println();

        System.out.println("Pilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahap = scanner.nextInt();
        System.out.println();
        String namaTahap = "";

        if(tahap == 1)
            namaTahap = "Presale";
        else if(tahap == 2)
            namaTahap = "Reguler";

        if(tahap != 1 && tahap != 2){
            System.out.println("Input tidak valid!");
            System.exit(0);
        }

        int jenis;
        String namaJenis = "";

        if(tahap == 2){
            System.out.println("Pilih tahap tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih tahap tiket (1/2/3): ");
            jenis = scanner.nextInt();

            if(jenis == 1)
                namaJenis = "Festival";
            else if(jenis == 2)
                namaJenis = "VIP";
            else if(jenis == 3)
                namaJenis = "VVIP"; 
                
            if(jenis != 1 && jenis != 2 && jenis != 3){
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }else if(tahap == 1){
            System.out.println("Pilih tahap tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih tahap tiket (1/2): ");
            jenis = scanner.nextInt();

            if(jenis == 1)
                namaJenis = "VIP";
            else if(jenis == 2)
                namaJenis = "VVIP";

            if(jenis != 1 && jenis != 2){
                System.out.println("Input tidak valid!");
                System.exit(0);
            }
        }
        System.out.println();
        
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt();
        System.out.println();

        Tiket tiket;
        if(namaJenis.equals("Festival")){
            tiket = new Festival();
            Pemesanan pemesanan = new Pemesanan(namaPembeli, namaTahap, tiket, jumlah);
            pemesanan.cetakNota();
        }else if(namaJenis.equals("VIP")){
            tiket = new VIP();
            Pemesanan pemesanan = new Pemesanan(namaPembeli, namaTahap, tiket, jumlah);
            pemesanan.cetakNota();
        }else if(namaJenis.equals("VVIP")){
            tiket = new VVIP();
            Pemesanan pemesanan = new Pemesanan(namaPembeli, namaTahap, tiket, jumlah);
            pemesanan.cetakNota();
        }
        

        scanner.close();
    }
}
