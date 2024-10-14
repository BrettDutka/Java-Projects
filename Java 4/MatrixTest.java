import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void constructor() {
        int[][] v = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(3, 3, v);
        assertEquals(3, matrix.getRows());
        assertEquals(3, matrix.getColumns());
        assertArrayEquals(v, matrix.getMatrix());
    }

    @Test
    void set() {
        int[][] v = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(3, 3, v);
        matrix.set(1, 1, 10);
        int[][] ans = {{1, 2, 3}, {4, 10, 6}, {7, 8, 9}};
        assertArrayEquals(ans, matrix.getMatrix());
    }

    @Test
    void add() {
        int[][] v1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] v2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        Matrix m1 = new Matrix(3, 3, v1);
        Matrix m2 = new Matrix(3, 3, v2);
        m1.add(m2);
        int[][] ans = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        assertArrayEquals(ans, m1.getMatrix());
    }

    @Test
    void multiply() {
        int[][] v1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] v2 = {{7, 8}, {9, 10}, {11, 12}};
        Matrix m1 = new Matrix(2, 3, v1);
        Matrix m2 = new Matrix(3, 2, v2);
        m1.multiply(m2);
        int[][] ans = {{58, 64}, {139, 154}};
        assertArrayEquals(ans, m1.getMatrix());
    }

    @Test
    void transpose() {
        int[][] v = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(3, 3, v);
        matrix.transpose();
        int[][] ans = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(ans, matrix.getMatrix());
    }

    @Test
    void rotate() {
        int[][] v = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(3, 3, v);
        matrix.rotate();
        int[][] ans = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(ans, matrix.getMatrix());
    }

    @Test
    void testToString() {
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(3, 3, values);
        String ans = "1\t2\t3\n4\t5\t6\n7\t8\t9\n";
        assertEquals(ans, matrix.toString());
    }
}