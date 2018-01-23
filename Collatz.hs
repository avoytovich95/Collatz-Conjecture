-- Collatz Conjecture in Haskell
-- Tested in ghci

collatz :: (Integral a, Show a) => a -> IO ()
collatz 1 = print 1
collatz num = do
    _ <- putStr ((show num) ++ " ")
    if even num 
        then collatz (num `div` 2)
        else
            collatz (3 * num + 1)

main :: IO ()
main = do
    putStr "Enter a positive integer: "
    num <- readLn :: IO Integer
    collatz num
	
-- Demo:
--  *Main> main
--	Enter a positive integer: 300
--	300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1
--
--  *Main> main
--	Enter a positive integer: 120
--	120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
