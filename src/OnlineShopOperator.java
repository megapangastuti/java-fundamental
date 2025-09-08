public class OnlineShopOperator {
    public static void main(String[] args) {
        // Harga barang
        int hargaBaju = 120_000;
        int hargaCelana = 150_000;
        int hargaSepatu = 300_000;

        // Jumlah barang yang dibeli
        int jumlahBaju = 2;
        int jumlahCelana = 1;
        int jumlahSepatu = 1;

        // Hitung total belanja (operator aritmatika)
        int totalBelanja = (hargaBaju * jumlahBaju) + (hargaCelana * jumlahCelana) + (hargaSepatu * jumlahSepatu);
        System.out.println("Total Belanja: Rp" + totalBelanja);

        // Diskon 10% jika total belanja di atas 500.000
        double diskon = (totalBelanja > 500_000) ? totalBelanja * 0.1 : 0; // operator ternary + perbandingan
        System.out.println("Diskon: Rp" + diskon);

        // Hitung ongkir (misal ongkir Rp20.000, gratis jika belanja > 700.000)
        int ongkir = (totalBelanja > 700_000) ? 0 : 20_000;
        System.out.println("Ongkir: Rp" + ongkir);

        // Total yang harus dibayar
        double totalBayar = totalBelanja - diskon + ongkir;
        System.out.println("Total Bayar: Rp" + totalBayar);

        // Operator logika: cek apakah pembeli dapat bonus hadiah
        // Syarat: beli minimal 2 baju DAN total belanja > 400.000
        boolean dapatBonus = (jumlahBaju >= 2) && (totalBelanja > 400_000);
        System.out.println("Apakah dapat bonus hadiah? " + dapatBonus);
    }
}
