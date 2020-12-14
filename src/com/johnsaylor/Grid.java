package com.johnsaylor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grid {
    private int rowLength;
    private Cell[][] grid;

    public Grid(String[] original) {
        this.rowLength = original[0].length();
        this.grid = new Cell[original.length][];
        for (int row = 0; row < original.length; row++) {
            grid[row] = new Cell[rowLength];
            for (int column = 0; column < rowLength; column++) {
                grid[row][column] = new Cell();
                }
            }

        for (int row = 0; row < original.length; row++) {
            for (int column = 0; column < rowLength; column++) {
                grid[row][column].createBomb(getNeighbors(row, column));
                if (original[row].charAt(column) == 'O') grid[row][column].setBomb();
            }
        }
        }

    public void waitStep() {
        for (Cell[] row : grid) {
            for (Cell cell : row) {
                cell.countdown();
            }
        }
        printGrid();
    }

    public void fillStep() {
        for (Cell[] row : grid) {
            for (Cell cell : row) {
                cell.countdown();
                cell.fill();
            }
        }
        printGrid();
    }


    public void printGrid() {
        for (Cell[] row : grid) {
            for (Cell cell : row) {
                System.out.print(cell.toString());
            }
            System.out.println();
        }
    }



    private List<Cell> getNeighbors(final int row, final int column) {
        final int height = grid.length;
        List<Cell> result = new ArrayList<>();
//        if (row - 1 > 0 && column - 1 > 0) result.add(grid[row -1][column - 1]);
        if (row - 1 >= 0) result.add(grid[row - 1][column]);
//        if (row - 1 > 0 && column + 1 < rowLength) result.add(grid[row - 1][column + 1]);

        if (column - 1 >= 0) result.add(grid[row][column - 1]);
        result.add(grid[row][column]);
        if (column + 1 < rowLength) result.add(grid[row][column + 1]);

//        if (row + 1 < height && column - 1 > 0) result.add(grid[row + 1][column - 1]);
        if (row + 1 < height) result.add(grid[row + 1][column]);
//        if (row + 1 < height && column + 1 < rowLength) result.add(grid[row + 1][column + 1]);
        return result;
    }

    public void continuous() {
        printGrid();
        fillStep();
        while (true) {
            try {
                Thread.sleep(1000);
                waitStep();
                Thread.sleep(1000);
                fillStep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


