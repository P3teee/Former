import java.awt.*;

/**
 * Created by bepe14 on 2016-09-30.
 */
public class triangle {
    private Color col;
    private double length;
    private double heigth;

    public triangle(Color col , double length, double heigth){
        this.col = col;
        this.length = length;
        this.heigth = heigth;
    }

    public double getArea() {
        return (length*heigth)/2;
    }
    public double getOmkrats() {
        return length*3;
    }
    public Color getCol() {
        return col;
    }

    public double getLength() {
        return length;
    }

    public double getHeigth() {
        return heigth;
    }

}
