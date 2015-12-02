/**
 * Created by xiaosun on 12/2/15.
 */
public enum Orientation {
    S("S"),
    N("N"),
    W("W"),
    E("E");

    private String string;

    Orientation(String string) {

        this.string = string;
    }

    public Orientation left() {
        return Orientation.W;
    }
}
