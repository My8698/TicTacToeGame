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
        public static void main(String[] args) {
            System.out.println("Welcome to the TicTacToe Game Program");
            System.out.println(gameboard[1] + " | " + gameboard[2] + " | " + gameboard[3]);
            System.out.println("----------");
            System.out.println(gameboard[4] + " | " + gameboard[5] + " | " + gameboard[6]);
            System.out.println("----------");
            System.out.println(gameboard[7] + " | " + gameboard[8] + " | " + gameboard[9]);
            createEmptyBoard();
            chooseLetter();
          }

    }