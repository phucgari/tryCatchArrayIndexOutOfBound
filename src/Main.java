import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[]arr=createRandom();
        Scanner scanner= new Scanner(System.in);

        try {
            int index=scanner.nextInt();
            System.out.println(arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }catch (InputMismatchException e){
            System.out.println("Điền số vào!");
        }
    }
    public static int[] createRandom() {
        Random rd=new Random();
        int[]result=new int[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < result.length; i++) {
            result[i]=rd.nextInt(100);
            System.out.print(result[i]+ " ");
        }
        return result;
    }
}