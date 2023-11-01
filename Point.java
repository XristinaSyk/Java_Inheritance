public class Point {
    private int x;
    private int y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public  double distance(){
        double dist;
        dist= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return dist;
    }
    public double distance(int x, int y){
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return  Math.sqrt(Math.pow(xDiff,2)+Math.pow(yDiff,2));
    }

    public double distance(Point another){
        int xDiff=this.x-another.x;
        int yDiff=this.y-another.y;
        return  Math.sqrt(Math.pow(xDiff,2)+Math.pow(yDiff,2));
    }
}
