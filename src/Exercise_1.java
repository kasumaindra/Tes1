
import java.util.Scanner;
public class Exercise_1 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Length : ");
        int length = scanner.nextInt();

        System.out.println("Input Length : ");
        int width = scanner.nextInt();

//         int length = 5;
//         int width = 3;

        int Retangle = length * width;

        System.out.println(Retangle);

        scanner.close();
    }


}
