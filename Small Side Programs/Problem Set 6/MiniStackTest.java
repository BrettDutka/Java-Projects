import static org.junit.jupiter.api.Assertions.*;

class MiniStackTest {

    @org.junit.jupiter.api.Test
    void add() {
        MiniStack<Integer> stack = new MiniStack<>();
        stack.add(1);
        assertEquals(1, stack.size());
        assertEquals(Integer.valueOf(1), stack.peek());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        MiniStack<Integer> stack = new MiniStack<>();
        assertNull(stack.peek());
        stack.add(2);
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        MiniStack<Integer> stack = new MiniStack<>();
        assertNull(stack.pop());
        stack.add(3);
        stack.add(4);
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(1, stack.size());

    }

    @org.junit.jupiter.api.Test
    void size() {
        MiniStack<Integer> stack = new MiniStack<>();
        assertEquals(0, stack.size());
        stack.add(5);
        stack.add(6);
        assertEquals(2, stack.size());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        MiniStack<Integer> stack = new MiniStack<>();
        assertTrue(stack.toString().equals(""));
        stack.add(10);
        stack.add(20);
        stack.add(30);
        assertTrue(stack.toString().equals("30, 20, 10"));
    }
}