% Collatz Conjecture written in Prolog
% Tested in swipl

collatz(1) :- write(1).
collatz(X) :-
    Y is X mod 2,
    Y = 0,
    write(X), write(' '),
    Z is X div 2,
    collatz(Z).
collatz(X) :-
    write(X), write(' '),
    Z is X * 3 + 1,
    collatz(Z).

run_collatz :-
    write('Enter a positive integer: '),
    read(X),
    collatz(X).

% Demo:
% ?- run_collatz.
% Enter a positive integer: 300.
% 300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1
% true .
%
% ?- run_collatz.
% Enter a positive integer: 120.
% 120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
% true .