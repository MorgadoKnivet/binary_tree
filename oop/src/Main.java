public class Main {
    public static void main(String[] args){
        Point firstPoint = new Point(2,-3);
        Point secondPoint = new Point(2,-3);

        System.out.println("Is Points equals : " + firstPoint.isPointsEquals(secondPoint));
        System.out.println("Distance between two points : " + firstPoint.distanceBetweenPoints(secondPoint));
    }
}
