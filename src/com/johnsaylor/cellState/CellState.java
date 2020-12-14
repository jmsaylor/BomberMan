package com.johnsaylor.cellState;

// could have taken a step further w/ Behavior/Strategy Pattern

public interface CellState {
    void countdown();
    void explode();
    void fill();
}
