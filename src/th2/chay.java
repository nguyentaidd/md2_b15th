package th2;

import java.util.Scanner;

public class chay {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap chi so 1 phan tu bat ky : ");
        int x = sc.nextInt();
        try {
            System.out.println("Chi so 5 " + x + " la " + arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot gioi han mang");
        }
    }
}
