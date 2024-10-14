import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BigNatTest {

  @Test
  void testBigNatAdd() {
    BigNat bn1 = new BigNat("123");
    BigNat bn2 = new BigNat("456");
    bn1.add(bn2);
    Assertions.assertEquals(bn1.toString(), "123 + 456 is 579", "579");
  }

  @Test
  void testBigNatSub() {
    BigNat bn1 = new BigNat("500");
    BigNat bn2 = new BigNat("200");
    bn1.sub(bn2);
    Assertions.assertEquals(bn1.toString(), "500 - 200 is 300", "300");
  }

  @Test
  void testBigNatMul() {
    BigNat bn1 = new BigNat("12");
    BigNat bn2 = new BigNat("10");
    bn1.mul(bn2);
    Assertions.assertEquals(bn1.toString(), "12 * 10 is equal to 120", "120");

    BigNat bn3 = new BigNat("123");
    BigNat bn4 = new BigNat("456");
    bn3.mul(bn4);
    Assertions.assertEquals(bn3.toString(), "123 * 456 is equal to 56088", "56088");
  }

  @Test
  void testBigNatDiv() {
    BigNat bn1 = new BigNat("100");
    BigNat bn2 = new BigNat("10");
    bn1.div(bn2);
    Assertions.assertEquals(bn1.toString(), "100 / 10 is equal to 10", "10");

    BigNat bn3 = new BigNat("1000");
    BigNat bn4 = new BigNat("3");
    bn3.div(bn4);
    Assertions.assertEquals(bn3.toString(), "1000 / 3 is equal to 333", "333");

    assertThrows(IllegalArgumentException.class, () -> {
      BigNat bn5 = new BigNat("100");
      BigNat bn6 = new BigNat("0");
      bn5.div(bn6);
    }, "Division by zero throws IllegalArgumentException");
  }
}
