import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoOneTester {
    @Test
    public void multiplication() {
        assertEquals(3, SkillDemoOne.multiply(1, 2));
    }
}