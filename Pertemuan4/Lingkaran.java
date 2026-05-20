package Pertemuan4;

public class Lingkaran extends BangunDatar {
    private double radius;


    public Lingkaran(String warna, String border, double radius) {
        super(1,warna,border);
        this.radius = radius;
    } 
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
