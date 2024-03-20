import java.util.Scanner;
public class Exercise_5 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Memisahkan nama menjadi suku kata
        String[] sukuKata = nama.split(" ");

        // Mengambil huruf pertama dari setiap suku kata
        StringBuilder hurufPertamaNama = new StringBuilder();
        for (String suku : sukuKata) {
                hurufPertamaNama.append(suku.charAt(0));
        }

        String hurufNama = hurufPertamaNama.toString().toUpperCase();
        System.out.println("Huruf pertama dalam nama: " + hurufNama);
    }
}

