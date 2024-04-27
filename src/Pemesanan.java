// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        double finalHarga = tiket.harga * jumlah;
        System.out.println(finalHarga);
        if(tahap.equals("Presale") && (tiket.nama.equals("VIP") || tiket.nama.equals("VVIP"))){
            finalHarga = finalHarga - (tiket.harga * 0.20 * jumlah);
            System.out.println(finalHarga);
        }

        System.out.println("--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: "+nama);
        System.out.println("Tahap Pembelian: "+tahap);
        System.out.println("Jenis Tiket: "+tiket.nama);
        System.out.println("Jumlah Tiket: "+jumlah);
        System.out.println("Total Harga: Rp "+finalHarga);
    }
}
