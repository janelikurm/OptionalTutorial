import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class ListTutorialTest {

    private static ListTutorial listTutorial = new ListTutorial();
    @Test
    void sumOfElements() {
        assertEquals(6, listTutorial.sumOfList(List.of(1, 2, 3)));
    }

    @Test
    void sumOfElementsWithNull() {
        assertEquals(3, listTutorial.sumOfList(asList(1, 2, null)));
    }

    @Test
    void sumOfElements1() {
        assertEquals(61, listTutorial.sumOfList(List.of(5, 26, 3, 8, 19)));
    }
    @Test
    void concatenateLists() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6), listTutorial.concatLists(List.of(1, 2, 3), List.of(4, 5, 6)));
    }

    @Test
    void concatenateListsWithNull() {
        assertEquals(asList(1, 2, 3, 4, 5, null), listTutorial.concatLists(asList(1, 2, 3), asList(4, 5, null)));
    }
    @Test
    void reversedList() {
        assertEquals(asList(7, 5, 6, 1, 3, 2), listTutorial.reverseList(asList(2, 3, 1, 6, 5, 7)));
    }
    @Test
    void reversedListWithNull() {
        assertEquals(asList(7, 5, 6, null, 3, 2), listTutorial.reverseList(asList(2, 3, null, 6, 5, 7)));
    }
}