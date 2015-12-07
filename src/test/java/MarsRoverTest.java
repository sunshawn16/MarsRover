import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiaosun on 12/7/15.
 */
public class MarsRoverTest {
    @Test
    public void shouldFaceWestWhenTurnLeftGivenNorth() throws Exception {
        MarsRover marsRover = new MarsRover(1, 1, "N");

        assertThat(marsRover.command("L"), is("1,1,W"));
    }

    @Test
    public void shouldFaceEastWhenTurnRightGivenNorth() throws Exception {

        MarsRover marsRover = new MarsRover(1, 1, "N");

        assertThat(marsRover.command("R"), is("1,1,E"));

    }
}
