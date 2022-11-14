package com.yankun.hw1;

/**
 *
 *
 * Point represents a point in a Cartesian Coordinate System
 * Points are immutable. They cannot be changed once they have been created
 * @author yankunM
 */
public class Point {
    private final int x;
    private final int y;

    /**
     * Constructs and Initializes a Point on position (x,y)
     * @param x x coordinate
     * @param y y coordinate
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates distance between this point
     * and another point that was passed as an argument
     * @param other the other point
     * @return the distance between
     */
    public double distance(Point other){
        return Math.hypot(this.x - other.x, this.y - other.y);
    }

    /**
     *
     * @return
     */
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
