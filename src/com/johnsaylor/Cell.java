package com.johnsaylor;

import com.johnsaylor.cellState.BombState;
import com.johnsaylor.cellState.CellState;
import com.johnsaylor.cellState.EmptyState;

import java.util.List;

public class Cell {
    private CellState bomb = null; //via setter
    private CellState empty;
    private CellState state;

    public Cell() {
        this.empty = new EmptyState(this);
        this.state = empty;
    }

    public void countdown() {
        state.countdown();
    }

    public void explode() {
        state.explode();
    }

    public void fill() {
        state.fill();
    }

    public void setBomb() {
        this.state = bomb;
    }

    public void setEmpty() { this.state = empty; }

    public void createBomb(List<Cell> blastRadius) {
        this.bomb = new BombState(this, blastRadius);
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
