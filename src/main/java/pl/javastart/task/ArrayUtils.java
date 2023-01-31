package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);

    int getNumber() {
        int number;
        do {
            number = scanner.nextInt();
        } while (!((number > 0 && number <= 100)));
        return number;
    }

    int[][] createArray(int row, int columns) {
        int[][] array = new int[row][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        return array;
    }

    void printArray(int[][] array) {
        for (int[] row : array) {
            for (int columns : row) {
                System.out.printf("%-4d |", columns);
            }
            System.out.printf("%n%s%n", "------".repeat(array[0].length));
        }
    }
}

