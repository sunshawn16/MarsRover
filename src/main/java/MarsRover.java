/**
 * Created by xiaosun on 12/7/15.
 */
public class MarsRover {
    private int x;
    private int y;
    private String orientation;

    public MarsRover(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public String command(String direction) {
        if (direction.equals("L")) {
            this.orientation = "W";
            return showString();
        } else if (direction.equals("R")) {
            this.orientation = "E";
            return showString();
        }
        return null;
    }

    private String showString() {
        return this.x + "," + this.y + "," + this.orientation;
    }
}
