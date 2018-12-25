import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
  @ClassRule
  public static Timeout classTimeout = Timeout.seconds(1);

  @Test
  public void test1() throws Exception {
    TimeUnit.SECONDS.sleep(1);
  }

  @Test
  public void test2() throws Exception {
    TimeUnit.SECONDS.sleep(1);
  }
}
