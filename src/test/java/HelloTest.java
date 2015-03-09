import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HelloTest {
    private Hello hello;
    @Before
    public void setUp() throws Exception {
        hello = new Hello();
    }

    @Test
    public void testSayHello() throws Exception {
        assertThat(hello.sayHello("Jun"), is("Hello, Jun"));
    }

    @Test
    public void testSayHi() throws Exception {
        assertThat(hello.sayHi("Jun"), is("Hi, Jun"));

    }
}