package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);
    private int row;
    private int columns;
    private int[][] array;

    void getRowAndColumns() {
        do {
            System.out.println("Podaj liczbę wierszy (max 100)");
            row = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn (max 100)");
            columns = scanner.nextInt();
        } while (!((row > 0 && row <= 100) && (columns > 0 && columns <= 100)));
    }

    void createArray() {
        array = new int[row][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
    }

    void printArray(int[][] array) {
        for (int[] row : array) {
            for (int columns : row) {
                System.out.printf("%-4d |", columns);
            }
            System.out.printf("%n%s%n", "------".repeat(columns));
        }
    }

    int[][] getArray() {
        return array;
    }

    void setArray(int[][] array) {
        this.array = array;
    }
}

