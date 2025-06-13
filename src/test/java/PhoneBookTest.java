import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Алиса", "899989"));
        assertEquals(-1, phoneBook.add("Алиса", "766554")); // Повторяющееся имя
        assertEquals(2, phoneBook.add("Роберт", "45676754"));
        assertEquals(3, phoneBook.add("Карл", "6654457"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алиса", "899989");
        phoneBook.add("Роберт", "45676754");
        assertEquals("Алиса", phoneBook.findByNumber("899989"));
        assertEquals("Роберт", phoneBook.findByNumber("45676754"));
        assertNull(phoneBook.findByNumber("777777")); // Несуществующий номер
    }
}
