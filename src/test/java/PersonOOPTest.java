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

    @Test
    public void testClassStudent() {
        Student person = new Student("John", "USA", "A", 2, 2.0);
        String expect = "Student has name: John address: USA program: A year: 2 fee: 2.0";
        String actual = person.toString();
        assertEquals(expect, actual);
    }
}
