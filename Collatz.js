// Collatz Conjecture written in Javascript
// Tested in node

const readline = require('readline')
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question('Enter a positive integer: ', num => {
    while (num != 1) {
        process.stdout.write(`${num} `)
        if (num % 2 == 0)
            num /= 2
        else num = num * 3 + 1
    }
    process.stdout.write(`${num} `)

    rl.close()
})

/* Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1
    
    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
*/