import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HelloTest {

    @org.junit.Test
    public void testSayHello() throws Exception {
        Hello hello = new Hello();
        assertThat(hello.sayHello("Jun"), is("Hello, Jun"));
    }
}