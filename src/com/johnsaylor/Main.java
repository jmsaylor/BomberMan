package com.johnsaylor;

public class Main {

    public static void main(String[] args) {
        String[] map4 = "..OO,O...,OO..,.O.O".split(",");
        String[] map3 = "..O.,....,.O..,.O..".split(",");
        String[] map2 = "..O...,......,...O..,.O....,OO....,OO.O..".split(",");
        String[] map = ".....O...,.....O...,......O..,....O....,OO.......,OO.O.....".split(",");
        Grid grid = new Grid(map4);
        grid.continuous();
//        System.out.println("1 - INITIAL STATE");
//        grid.printGrid();
//        System.out.println("STEP 2 - WAIT");
//        grid.waitStep();
//        System.out.println("STEP 3 - FILL");
//        grid.fillStep();
//        System.out.println("STEP 4 - FIRST BOMBS");
//        grid.waitStep();
//        System.out.println("STEP 5 - REPEAT FILL");
//        grid.fillStep();
//        System.out.println("STEP 6 - EXPLODE");
//        grid.waitStep();
    }
}
