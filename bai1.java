import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 

        System.out.println("Nhap day so nguyen (Nhap 0 de dung):");

        while (true) {
            int num = sc.nextInt(); 
            if (num == 0) {
                break; 
            }

            sum += num; 
            count++; 

            if (num > max) {
                max = num; 
            }

            if (num < min) {
                min = num; 
            }
        }

        if (count == 0) {
            System.out.println("Khong co so nao duoc nhap.");
        } else {
            float average = (float) sum / count; 
            System.out.printf("Trung binh cong: %.2f\n", average);
            System.out.println("So lon nhat: " + max);
            System.out.println("So nho nhat: " + min);
        }
    }
}