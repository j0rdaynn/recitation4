import java.util.Scanner;

public class Recitation4 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        /* Get an x and y coordinates from the user.
            Create an instance of a Circle at (x,y) with radius=16.0 called circle16;
        Create another instance of a Circle at (14,12) with radius=40.0 called circle40;
        If the two circles intersect, print Circles intersect!; otherwise print Circles do not intersect!.*/
        // add your code here

        System.out.println("Enter x:");
        double x = scan.nextDouble();
        System.out.println("Enter y:");
        double y = scan.nextDouble();

        Point points = new Point(x,y);
        Circle circle16 = new Circle(points, 16.0);

        Circle circlee40 = new Circle(40.0);
       //this.points(14,12);
       //points = (14,12);

        Point pointe = new Point(14,12);
        circlee40.setLocation(pointe);

        if (circlee40.intersects(circle16)){
            System.out.println("Circles intersect!");

        }else{
            System.out.println("Circles do not intersect!");

        }

    }
}
