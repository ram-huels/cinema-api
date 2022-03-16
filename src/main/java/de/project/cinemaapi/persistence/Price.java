package de.project.cinemaapi.persistence;

public class Price {

    private double basisPrice;

    private double isReduced;

    private double is3D;

    private double isBoxSeat;

    public Price(double basisPrice, double isReduced, double is3D, double isBoxSeat) {
        this.basisPrice = basisPrice;
        this.isReduced = isReduced;
        this.is3D = is3D;
        this.isBoxSeat = isBoxSeat;
    }

    public Price() {

    }

    public double getBasisPrice() {
        return basisPrice;
    }

    public void setBasisPrice(double basisPrice) {
        this.basisPrice = basisPrice;
    }

    public double getIsReduced() {
        return isReduced;
    }

    public void setIsReduced(double isReduced) {
        this.isReduced = isReduced;
    }

    public double getIs3D() {
        return is3D;
    }

    public void setIs3D(double is3D) {
        this.is3D = is3D;
    }

    public double getIsBoxSeat() {
        return isBoxSeat;
    }

    public void setIsBoxSeat(double isBoxSeat) {
        this.isBoxSeat = isBoxSeat;
    }
}
