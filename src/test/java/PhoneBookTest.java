import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Алиса", "899989"));
        assertEquals(-1, phoneBook.add("Алиса", "766554")); // Повторяющееся имя
        assertEquals(2, phoneBook.add("Роберт", "45676754"));
        assertEquals(3, phoneBook.add("Карл", "6654457"));
    }
}
