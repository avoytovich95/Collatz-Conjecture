# Collatz Conjecture in Ruby
# Tested in Ruby Scripter

def collatz(num)
    print "#{num} "
    unless num == 1
        if num % 2 == 0
            collatz(num / 2)
        else 
            collatz(num * 3 + 1)
        end
    end
end

print "Enter a positive integer: "
num = gets.to_i
collatz(num)
puts

=begin
Demo:
    Enter a positive integer: 300
    300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1

    Enter a positive integer: 120
    120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
=end
