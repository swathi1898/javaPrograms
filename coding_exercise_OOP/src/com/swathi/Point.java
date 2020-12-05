package com.swathi;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        int xA = getX();
        int yA = getY();
        int x = 0;
        int y = 0;
        return Math.sqrt((x-xA)*(x-xA)+(y-yA)*(y-yA));
    }
    public double distance(int x, int y){
        int xA = getX();
        int yA = getY();
        return Math.sqrt((x-xA)*(x-xA)+(y-yA)*(y-yA));

    }
    public double distance(Point point){
        int xA = point.getX();
        int yA = point.getY();
        return Math.sqrt((x-xA)*(x-xA)+(y-yA)*(y-yA));
    }
}
