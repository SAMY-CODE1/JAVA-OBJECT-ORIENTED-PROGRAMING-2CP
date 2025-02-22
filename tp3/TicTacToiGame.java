package tp3;

import java.util.Scanner;

public class TicTacToiGame {
    // get_cell_row
    public static int get_cell_row(char input, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == input) {
                    return i;
                }
            }
        }
        return -1;

    }

    // get_cell_collumn
    public static int get_cell_column(char input, char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == input) {
                    return j;
                }
            }
        }
        return -1;
    }
    // Define a character 2D array that contains values from 1 to 9
    public static char[][] show() {
        char[][] arr = new char[3][3];
        arr[0][0] = '1';
        arr[0][1] = '2';
        arr[0][2] = '3';
        arr[1][0] = '4';
        arr[1][1] = '5';
        arr[1][2] = '6';
        arr[2][0] = '7';
        arr[2][1] = '8';
        arr[2][2] = '9';
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
    
        char[][] tab =show();
        // choise a number
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a char  of cell :");
        char val = scan.next().charAt(0);
        int row = get_cell_row(val, tab);
        int col = get_cell_column(val, tab);
        System.out.println("Cell " + val + " is at row " + row + " and column " + col);
        scan.close();
    }

}
