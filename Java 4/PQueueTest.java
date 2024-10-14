import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class PQueueTest {

    @Test
    void enqueue() {
        PQueue<Integer> queue = new PQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(0, queue.size());

        PQueue<String> q2 = new PQueue<>();
        q2 = q2.enqueue("Hello");
        q2 = q2.enqueue("World");
        q2 = q2.enqueue("Today");
        assertEquals(3, q2.size());

    }

    @Test
    void dequeue() {
        PQueue<String> q1 = new PQueue<>();
        q1 = q1.enqueue("Hello");
        q1 = q1.enqueue("World");
        q1 = q1.enqueue("Today");
        q1 = q1.enqueue("Great");
        assertEquals(4, q1.size());
        q1 = q1.dequeue();
        assertEquals(3, q1.size());
    }

    @Test
    void peek() {
        PQueue<Integer> queue = new PQueue<>();
        assertNull(queue.peek());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(null, queue.peek());
        queue.dequeue();
        assertEquals(null, queue.peek());
    }

    @Test
    void of(){
        PQueue<Integer> real = PQueue.of(1, 2, 3);
        PQueue<Object> ans = new PQueue<>().enqueue(1).enqueue(2).enqueue(3);
        assertEquals(ans, real);

    }

    @Test
    void size() {
        PQueue<Integer> queue = new PQueue<>();
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(0, queue.size());
        queue.enqueue(2);
        assertEquals(0, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
    }
}