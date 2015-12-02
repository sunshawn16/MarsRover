import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiaosun on 12/1/15.
 */
public class MarsRoverTest {
    @Test
    public void shouldFaceWestWhenReciveCommandLeft() throws Exception {
        MarsRover marsRover = new MarsRover(1,1,"N");

        String result = marsRover.receiveCommand("L");

        assertThat(result, is("1,1,W"));
    }

    @Test
    public void shouldFaceEastWhenReceivingCommandRight() throws Exception {
        MarsRover marsRover = new MarsRover(1, 1, "N");

        String result = marsRover.receiveCommand("R");

        assertThat(result,is("1,1,E"));
    }

    @Test
    public void whatever() throws Exception {
        MarsRover marsRover = new MarsRover(1, 1, "S");

        String result = marsRover.receiveCommand("R");

        assertThat(result,is("1,1,W"));
    }
}
