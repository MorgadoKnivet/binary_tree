public class Point {
    private static final int POW_TWO = 2;

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    protected boolean equals(Point point) {
        return point.y == this.y && point.x == this.x;
    }

    private Double distanceBetweenPoints(Point point) {
        int differenceFirstElements = (point.x - this.x);
        int differenceSecondElements = (point.y - this.y);

        Double firstElementsPwoTwo = Math.pow(differenceFirstElements, POW_TWO);
        Double secondElementsPwoTwo = Math.pow(differenceSecondElements, POW_TWO);

        return Math.sqrt(firstElementsPwoTwo + secondElementsPwoTwo);
    }
}
