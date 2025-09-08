public class OnlineShopIfElse {
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

        // Hitung diskon dengan if else
        double diskon;
        if (totalBelanja > 500_000) {
            diskon = totalBelanja * 0.1; // 10%
        } else {
            diskon = 0;
        }
        System.out.println("Diskon: Rp" + diskon);

        // Hitung ongkir dengan if else
        int ongkir;
        if (totalBelanja > 700_000) {
            ongkir = 0;
        } else {
            ongkir = 20_000;
        }
        System.out.println("Ongkir: Rp" + ongkir);

        // Total yang harus dibayar
        double totalBayar = totalBelanja - diskon + ongkir;
        System.out.println("Total Bayar: Rp" + totalBayar);

        // Cek apakah dapat bonus
        boolean dapatBonus;
        if (jumlahBaju >= 2 && totalBelanja > 400_000) {
            dapatBonus = true;
        } else {
            dapatBonus = false;
        }
        System.out.println("Apakah dapat bonus hadiah? " + dapatBonus);
    }
}
