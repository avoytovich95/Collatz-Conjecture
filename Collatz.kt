// Collatz Conjecture written in Kotlin
// Tested in Kotlin sdk compiler

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Enter a positive integer: ")
    var num = input.nextInt()

    while (num != 1) {
        print("$num ")
        if (num % 2 == 0)
            num /= 2
        else 
            num = num * 3 + 1
    }
    println(num)
}

/* Demo:   
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
*/
