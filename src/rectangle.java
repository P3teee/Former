import java.awt.*;

/**
 * Created by bepe14 on 2016-09-30.
 */
public class rectangle {
    private Color col;
    private double lenght;
    private double height;

    public rectangle(Color col, double lenght, double height) {
        this.col = col;
        this.lenght = lenght;
        this.height = height;
    }

    public double getArea() {
        return (lenght*height);
    }
    public double getOmkrats() {
        return (height*2)+(lenght*2);
    }

    public Color getCol() {
        return col;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }
}
