; Collatz Conjecture written in Clojure
; Tested in Clojure Repl

(ns Collatz
  (gen-class))

(defn collatz [num]
  (print (str num " "))
  (if (not= num 1)
    (cond
      (even? num) (collatz (/ num 2))
      (odd? num) (collatz (+ (* num 3) 1)))))

(print "Enter a positive integer: ") (flush)
(collatz (read-string (read-line)))

; Demo:
; Enter a positive integer: 300
; 300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1 
; => nil
;
; Enter a positive integer: 120
; 120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
; => nil
