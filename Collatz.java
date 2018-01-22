// Collatz Conjecture written in Java
// Tested in JDK

import java.util.Scanner;

public class Collatz{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();

        while(num != 1){
            System.out.print(num + " ");
            if((num % 2) == 0)
                num /= 2;
            else
                num = num * 3 + 1;
        } 
        System.out.println(num);
    }
}

/* Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
*/
