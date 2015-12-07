/**
 * Created by xiaosun on 12/7/15.
 */
public class JupiterRover {
    private int x;
    private int y;
    private Direction orientation;

    public JupiterRover(int x, int y, Direction orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void execute(String command) {
        if (command.equals("L")) {
            turnRight();
        } else if (command.equals("R")) {
            turnLeft();
        }
    }

    private void turnRight() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Direction.WEST;
                break;
            case SOUTH:
                this.orientation = Direction.EAST;
                break;
            case WEST:
                this.orientation = Direction.SOUTH;
                break;
            case EAST:
                this.orientation = Direction.NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (this.orientation) {
            case NORTH:
                this.orientation = Direction.EAST;
                break;
            case SOUTH:
                this.orientation = Direction.WEST;
                break;
            case WEST:
                this.orientation = Direction.NORTH;
                break;
            case EAST:
                this.orientation = Direction.SOUTH;
                break;
        }
    }

    public String getStatus() {
        return this.x + " " + this.y + " " + this.orientation.getDirection().toString();
    }
}
