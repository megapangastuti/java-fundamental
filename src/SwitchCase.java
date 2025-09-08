public class SwitchCase {
    public static void main(String[] args) {
        // 1. Struktur Dasar
        /* switch (ekspresi) {
            case nilai1:
                // blok kode
                break;
            case nilai2:
                // blok kode
                break;
            default:
                // blok kode jika tidak ada yang cocok
        } */

        // 2. contoh switch case tradisional
        // jenis 1
        int hari = 3;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }

        // jenis 2
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            default -> System.out.println("Hari tidak valid");
        }

        // 3. Switch case expression
        String hasil = switch (day) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            default -> "Hari tidak valid";
        };
        System.out.println(hasil);

        // 4. Multiple labels
        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "Hari kerja";
            case 6, 7 -> "Akhir pekan";
            default -> "Hari tidak valid";
        };

        // 5. Yield pada switch case
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("Sedang bekerja...");
                yield "Hari kerja";
            }
            case 6, 7 -> "Akhir pekan";
            default -> "Hari tidak valid";
        };
        System.out.println(result);
    }
}
