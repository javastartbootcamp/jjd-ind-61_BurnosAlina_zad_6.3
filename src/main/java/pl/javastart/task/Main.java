package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        System.out.println("Podaj liczbę wierszy (max 100)");
        int row = utils.getNumber();
        System.out.println("Podaj liczbę kolumn (max 100)");
        int columns = utils.getNumber();
        int[][] array = utils.createArray(row, columns);
        utils.printArray(array);
    }
}
