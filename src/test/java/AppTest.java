import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();

        assertEquals(10, app.add(5, 5));
    }
}