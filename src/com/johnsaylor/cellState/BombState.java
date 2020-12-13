package com.johnsaylor.cellState;

import com.johnsaylor.Cell;
import com.johnsaylor.explosion.Command;
import com.johnsaylor.explosion.DetonateCommand;

import java.util.List;

public class BombState implements CellState {
    Cell cell;
    int counter;
    Command detonator;

    public BombState(Cell cell, List<Cell> blastRadius) {
        this.cell = cell;
        this.detonator = new DetonateCommand(blastRadius);
        setCounter();
    }

    @Override
    public void countdown() {
        counter--;
        if (counter == 0) {
            detonator.execute();
            explode();
        }
    }

    @Override
    public void explode() {
        setCounter();
        cell.setEmpty();

    }

    @Override
    public void fill() {
        //do nothing bc already a bomb
    }

    private void setCounter() {
        this.counter = 3;
    }

    @Override
    public String toString() {
        return "O";
    }
}
