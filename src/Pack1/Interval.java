package Pack1;

public class Interval {
    int x;
    int y;

    // Constructor
    public Interval(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Interval() {}

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj.getClass() != this.getClass()) return false;
        return (this.x == ((Interval) obj).x) && (this.y == ((Interval) obj).y);
    }

}
