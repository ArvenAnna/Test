package com.TestProjectTeam; //Комментарий Андрей: одинаковое название пакета проекта

public class Otrezok {
    private double x;
    private double x1;
    private double y;
    private double y1;

    //Комментарий Андрей: добавлены set,get

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY1() {
        return y1;
    }

    //Комментарий закончен

    public double lang(double x, double x1, double y, double y1){
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
        double xy = Math.sqrt(((x1 - x)*(x1 - x) + (y1 - y)*(y1 - y)));
        return xy;
    }
}
