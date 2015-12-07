import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by xiaosun on 12/7/15.
 */
public class JupiterRoverTest {
    @Test
    public void shouldFaceWestWhenTurnLeftGivenOriginalOrientationIsNorth() throws Exception {
        JupiterRover jupiterRover = new JupiterRover(1, 1, Direction.NORTH);

        jupiterRover.execute("L");

        assertThat(jupiterRover.getStatus(), is("1 1 W"));
    }

    @Test
    public void shouldReturnPositionX2Y1WhenTurnLeftGivenOriginalPositionIsX2Y1() throws Exception {
        JupiterRover jupiterRover = new JupiterRover(2, 1, Direction.NORTH);

        jupiterRover.execute("L");

        assertThat(jupiterRover.getStatus(), is("2 1 W"));
    }

    @Test
    public void shouldFaceEastWhenTurnLeftGivenOriginalOrientationIsSouth() throws Exception {
        JupiterRover jupiterRover = new JupiterRover(2, 1, Direction.SOUTH);

        jupiterRover.execute("L");

        assertThat(jupiterRover.getStatus(), is("2 1 E"));
    }

    @Test
    public void shouldFaceWestWhenTurnRightGivenOriginalOrientationIsSouth() throws Exception {
        JupiterRover jupiterRover = new JupiterRover(2, 1, Direction.SOUTH);

        jupiterRover.execute("R");

        assertThat(jupiterRover.getStatus(), is("2 1 W"));
    }
}
