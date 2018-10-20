import java.util.Random;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        int X;
        int index;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size in array: ");
        size = sc.nextInt();

        array = new int[size];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(50);
        }

        System.out.println("Print array: ");
        for (int num: array){
            System.out.println(num + "\t");
        }

        System.out.println("Enter X: ");
        X = sc.nextInt();

        System.out.println("Enter index: ");
        index = sc.nextInt();
        if (index<=1 | index>size){
            System.out.println("Can't add X in array");
        }else {
            for (int i =0; i<size;i++){
                array[index] = X;
            }
        }
        for (int num: array){
            System.out.println(num);
        }
    }
}
