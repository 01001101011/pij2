public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void moveTo(Point remote) {
        this.x = remote.x;
        this.y = remote.y;
    }
}
public class Point implements Measurable {
    private int x;
    private int y;

    getMeasure();

}