import java.util.Scanner;
public class ModifyCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the garden : ");
        int width = sc.nextInt();
        System.out.print("Enter the length of the garden : ");
        int length = sc.nextInt();
        System.out.print("Enter circular pond diameter : ");
        double diameter = sc.nextDouble();
        System.out.print("Enter square pond side length : ");
        double squareSize = sc.nextDouble();

        double radius = diameter / 2;
        double phi = 3.14;
        
        double totalLandArea = width * length;
        double circularPondArea = phi * radius * radius;
        double squarePondArea = squareSize * squareSize;

        double totalAreaGardenGrass = totalLandArea - (circularPondArea + squarePondArea);

        System.out.println(String.format("Total area of the garden grass is : %.2f m2", totalAreaGardenGrass));

        sc.close();

    }
}