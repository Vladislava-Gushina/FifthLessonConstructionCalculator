package com.msaggik.fifthlessonconstructioncalculator;

import java.io.Serializable;

public class CalculationMoney implements Serializable {
    private int wallpaperRoll, constructionGlue, costFurniture, square;

    public CalculationMoney(int wallpaperRoll, int constructionGlue, int costFurniture, int square) {
        this.wallpaperRoll = wallpaperRoll;
        this.constructionGlue = constructionGlue;
        this.costFurniture = costFurniture;
        this.square = square;
    }

    public int getWallpaperRoll() {
        return wallpaperRoll;
    }

    public void setWallpaperRoll(int wallpaperRoll) {
        this.wallpaperRoll = wallpaperRoll;
    }

    public int getConstructionGlue() {
        return constructionGlue;
    }

    public void setConstructionGlue(int constructionGlue) {
        this.constructionGlue = constructionGlue;
    }

    public int getCostFurniture() {
        return costFurniture;
    }

    public void setCostFurniture(int costFurniture) {
        this.costFurniture = costFurniture;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int result(){
        return getConstructionGlue() + getSquare() + getCostFurniture() + getWallpaperRoll();
    }
}
