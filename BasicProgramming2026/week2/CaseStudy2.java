public class CaseStudy2 {

    public static void main(String[] args) {
        

        int width = 50;
        int length = 100;
        double diameter = 2.0;
        double squareSize = 2.0;
        double phi = 3.14;

        double totalLandArea = width * length;
        double radius = diameter / 2;
        double circlePondArea = phi * radius * radius;
        double squarePondArea = squareSize * squareSize;

        double totalAreaGardenGrass = totalLandArea - (circlePondArea + squarePondArea);

        System.out.println(String.format("Total Area of Garden Grass: %.2f m²", totalAreaGardenGrass));

    }
}