/**
 * Created by xiaosun on 12/1/15.
 */
public class MarsRover {
    private final int x;
    private final int y;
    private final Orientation orientation;

    public MarsRover(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = Orientation.valueOf(orientation);
    }

    public String receiveCommand(String command) {
        Orientation orientationNext = getOrientation(command);
        return this.x + "," + this.y + "," + orientationNext.toString();
    }

    private Orientation getOrientation(String command) {

        if (this.orientation == Orientation.N) {
            if (command == "L") {
                return this.orientation.left();
            } else if (command == "R") {
                return Orientation.E;
            }
        }
        if (this.orientation == Orientation.S) {
            if (command == "R") {
                return Orientation.W;
            }
        }

        return null;
    }

}
