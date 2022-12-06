package com.bridgelabz;
import java.util.Scanner;
public class TicTacToe {
     /**
         * create a gameboard of char array of size 10
         */
     static char player, computer;
     static Scanner scanner = new Scanner(System.in);
     static char[] gameboard = new char[10];
        /**
         *createEmptyBoard Static method to create empty board
         * It takes board array indexes from 1 to 9 using for loop and assign
         * empty space to each element in the board.
         */
        private static void createEmptyBoard() {
            for (int index = 1; index < gameboard.length; index++) {
                gameboard[index] = ' ';
            }
        }

    /**
     * ability to choose letter X or O
     */

    public static void chooseLetter() {
        System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X') {
            player = 'X';
            computer = 'O';
        } else if (choice == 'Y') {
            player = 'O';
            computer = 'X';
        }
    }

    /**
     * display gameboard to player so that he can choose for letter option
     */
    public static void displayGameBoard(){
        System.out.println(gameboard[1] + " | " + gameboard[2] + " | " + gameboard[3]);
        System.out.println("----------");
        System.out.println(gameboard[4] + " | " + gameboard[5] + " | " + gameboard[6]);
        System.out.println("----------");
        System.out.println(gameboard[7] + " | " + gameboard[8] + " | " + gameboard[9]);
    }

    /**
     * Select the index from 1 to 9 to make a move
     */
    private static void makeMove() {
        System.out.println("Enter Location 1-9 to Make Move");
        int playLocation = scanner.nextInt();
        if (playLocation < 10 && playLocation > 0) {
            gameboard[playLocation] = player;
            displayGameBoard();
            makeMove();

        } else {
            System.out.println("Invalid Choice");
        }
    }
    /**
     * check for free space,
     * It checks free space is available or not before make a move and
     * count the number of spaces available
     */
    private static void checkFreeSpace()
    {
        boolean isSpaceAvailable = false;
        int numOfFreeSpaces = 0;
        for(int index=1;index<gameboard.length;index++)
        {
            if((gameboard[index] == ' '))
            {
                isSpaceAvailable = true;
                numOfFreeSpaces++;
            }
        }
        if(isSpaceAvailable == false)
        {
            System.err.println("Board is full.....! You can't make another move");
            System.exit(0);
        }
        else
        {
            System.out.println("Free space is available.......! you have "+numOfFreeSpaces+ " moves left");
        }
    }
    public static void main(String[] args) {
            System.out.println("Welcome to the TicTacToe Game Program");
            createEmptyBoard();
            chooseLetter();
            displayGameBoard();
            makeMove();
            checkFreeSpace();
          }

    }