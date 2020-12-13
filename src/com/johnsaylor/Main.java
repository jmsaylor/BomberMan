package com.johnsaylor;

public class Main {

    public static void main(String[] args) {
	// write your code herepublic static void test() {
        String[] map = ".......,...O...,....O..,.......,OO.....,OO.....".split(",");
        Grid grid = new Grid(map);
        System.out.println("1 - INITIAL STATE");
        grid.printGrid();
        System.out.println("STEP 2 - WAIT");
        grid.waitStep();
        System.out.println("STEP 3 - FILL");
        grid.fillStep();
        System.out.println("STEP 4 - FIRST BOMBS");
        grid.waitStep();
        System.out.println("STEP 5 - REPEAT FILL");
        grid.fillStep();
        System.out.println("STEP 6 - EXPLODE");
        grid.waitStep();
    }
}
