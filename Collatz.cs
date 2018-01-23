// Collatz Conjecture in C#
// Tested in dotnet

using System;

class Collatz
{
    public static void main(String[] args)
    {
        Console.Write("Enter a positive integer: ");
        int num = Convert.ToInt32(Console.ReadLine());

        while(num != 1){
            Console.Write(num + " ");
            if(num % 2 == 0)
                num =/ 2;
            else
                num = num * 3 + 1;
        }
        Console.WriteLine(num);
    }
}

/* Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
 */
 