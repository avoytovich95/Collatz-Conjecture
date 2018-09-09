package Collatz

import "fmt"

func main() {
	fmt.Print("Enter a positive integer: ")
	var num int
	fmt.Scanf("%d",&num)
	collatz(num)
}

func collatz(num int) {
	for num != 1 {
		fmt.Print(num, " ")
		if num % 2 == 0
			num /= 2
		else
			num = num * 3 + 1
	}
}

/* Demo:
	Enter a positive integer: 300
	300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1 
	Process finished with exit code 0

	Enter a positive integer: 120
	120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
	Process finished with exit code 0
*/