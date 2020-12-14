package com.johnsaylor.detonator;

import com.johnsaylor.Cell;

import java.util.List;

public class DetonateCommand implements Command{

    List<Cell> blastRadius;

    public DetonateCommand(List<Cell> cells) {
        this.blastRadius = cells;
    }

    @Override
    public void execute() {
        blastRadius.forEach(Cell::explode);
    }
}
