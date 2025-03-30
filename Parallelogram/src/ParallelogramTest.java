import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParallelogramTest {

    @Test
    void testGetArea() {
        Parallelogram p = new Parallelogram(10, 5, 7);
        assertEquals(50, p.getArea());
    }

    @Test
    void testGetPerimeter() {
        Parallelogram p = new Parallelogram(10, 5, 7);
        assertEquals(34, p.getPerimeter());
    }

    @Test
    void testIsSquare() {
        Parallelogram p1 = new Parallelogram(5, 5, 5);
        Parallelogram p2 = new Parallelogram(10, 5, 10);
        assertTrue(p1.isSquare());
        assertFalse(p2.isSquare());
    }

    @Test
    void testGetDiagonal() {
        Parallelogram p = new Parallelogram(3, 4, 4);
        assertEquals(5, p.getDiagonal(), 0.01);
    }

    @Test
    void testIncreaseSides() {
        Parallelogram p = new Parallelogram(10, 5, 7);
        p.increaseSides(2);
        assertEquals(84, p.getArea()); // Checking if the base increased correctly
        assertEquals(42, p.getPerimeter());
    }
}
