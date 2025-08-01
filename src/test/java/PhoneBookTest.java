import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алиса", "899989");//добавляем контакт
        phoneBook.add("Роберт", "45676754");//добавляем контакт
        assertEquals("899989", phoneBook.findByName("Алиса"));
        assertEquals("45676754", phoneBook.findByName("Роберт"));
        assertNull(phoneBook.findByName("Ева")); // Несуществующее имя
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алиса", "899989");
        phoneBook.add("Роберт", "45676754");
        phoneBook.add("Карл", "6654457");

        // Проверяем вывод всех имен
        String[] expectedNames = {"Алиса", "Карл", "Роберт"};
        String[] actualNames = new String[phoneBook.allNames.size()];
        phoneBook.allNames.toArray(actualNames);
        assertArrayEquals(expectedNames, actualNames);
    }
}
