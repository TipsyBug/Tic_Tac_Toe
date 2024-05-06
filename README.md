# Simple Tic-Tac-Toe

Java Project @JetBrains Academy

A program allows user to play against another player and testing your strategic thinking.


- The game board consists of a 3x3 grid. Players take turns marking an empty cell with their symbol (X or O).
- The objective is to get three of your symbols in a row, either horizontally, vertically, or diagonally.
- The game ends when a player wins or the board is full (resulting in a draw).

## Prerequisites

This program requires Java to compile and run.

## Installation

- Download this repository and unzip the .zip file in your desired location.
- Open a terminal, then navigate to the project root.
- Compile the program using the command ```javac "Simple Tic-Tac-Toe\task\src\tictactoe\Main.java"```.
- Run the program using the command ```java -cp "Simple Tic-Tac-Toe\task\src" tictactoe.Main```.

## Example of use

The symbol > represents the user input. Notice that it's not the part of the input.

```
> java -cp "Simple Tic-Tac-Toe\task\src" tictactoe.Main
---------
| _ _ _ |
| _ _ _ |
| _ _ _ |
---------
Enter the coordinates: 3 1
---------
| _ _ _ |
| _ _ _ |
| _ _ X |
---------
Enter the coordinates: 1 2
---------
| _ _ _ |
| O _ _ |
| _ _ X |
---------
Enter the coordinates: 3 3
---------
| _ _ X |
| O _ _ |
| _ _ X |
---------
Enter the coordinates: 1 1
---------
| _ _ X |
| O _ _ |
| O _ X |
---------
Enter the coordinates: 3 2
---------
| _ _ X |
| O _ X |
| O _ X |
---------
X wins

```
