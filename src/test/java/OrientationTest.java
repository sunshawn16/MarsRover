import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiaosun on 12/2/15.
 */
public class OrientationTest {
    @Test
    public void shouldFaceWestWhenTurnLeftGivenFacingNorth() throws Exception {
        Orientation now = Orientation.N.left();

        assertThat(now, is(Orientation.W));
    }
}