package com.johnsaylor.cellState;

import com.johnsaylor.Cell;

public class EmptyState implements CellState {
    Cell cell;

    public EmptyState(Cell cell) {
        this.cell = cell;
    }

    @Override
    public void countdown() {
        //do nothing
    }

    @Override
    public void explode() {
        //do nothing
    }

    @Override
    public void fill() {
        cell.setBomb();
    }

    @Override
    public String toString() {
        return ".";
    }
}
