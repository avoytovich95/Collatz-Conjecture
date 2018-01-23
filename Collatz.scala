// Collatz Conjecture written in Scala
// Tested in Scala sdk compiler 

import java.util.Scanner

object Collatz{
    def main(args: Array[String]): Unit ={
        val input = new Scanner(System.in)
        print("Enter a positive integer: ")
        var num = input.nextInt()

        collatz(num)
        println()
    }

    def collatz(num: Int): Unit ={
        print(s"$num ")
        if(num != 1){
            if (num % 2 == 0)
                collatz(num / 2)
            else
                collatz(num * 3 + 1)
        }
    }
}

/** Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
*/