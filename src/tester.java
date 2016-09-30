import java.awt.*;

/**
 * Created by bepe14 on 2016-09-30.
 */
public class tester {
    public static void main(String[] args) {
         rectangle rec1 = new rectangle(Color.red , 3.4 , 4);
        System.out.println("Rectangle 1 area: " + rec1.getArea());
        System.out.println("Rectangle 1 omkräts: " + rec1.getOmkrats());
        System.out.println("Rectangle 1 färg: " + rec1.getCol());

         triangle tri1 = new triangle(Color.BLACK, 2.1 , 3.1);
        System.out.println("Triangle 1 area: " + tri1.getArea());
        System.out.println("Triangle 1 omkräts: " + tri1.getOmkrats());
        System.out.println("Triangle 1 färg: " + tri1.getCol());
    }
}
