public class IfElse {
    public static void main(String[] args) {
        // 1. bentuk dasar
        /* if (condition) {

        } else if (condition){

        } else {

        } */

        // 2. else if example
        String inputUsername = "admin";
        String inputPassword = "admin123";
        Boolean isActive = true;

        Boolean cekUsername = inputUsername.equals("admin");
        Boolean cekPassword = inputPassword.equals("admin123");

        if(!cekUsername || !cekPassword){
            System.out.println("username atau password salah!");
        }else if(!isActive){
            System.out.println("masa aktif sudah habis");
        }else{
            System.out.println("Selamat Datang Admin");
        }
    }
}
