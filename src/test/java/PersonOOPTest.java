import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonOOPTest {
    @Test
    public void testClassPerson() {
        Person person = new Person("John", "USA");
        String expect = "Person has name: John address: USA";
        String actual = person.toString();
        assertEquals(expect, actual);
    }
}
