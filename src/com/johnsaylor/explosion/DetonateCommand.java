package com.johnsaylor.explosion;

import com.johnsaylor.Cell;

import java.util.ArrayList;
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
