import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalTest {

    private static OptionalTutorial o = new OptionalTutorial();

    @Test
    void nameKati() {
        assertEquals(Optional.of(new User("Kati")), o.searchUser("Kati"));
    }

    @Test
    void nameNotFound() {
        assertEquals(Optional.empty(), o.searchUser("Tõnu"));
    }
    @Test
    void nameEmpty() {
        assertEquals(Optional.empty(), o.searchUser(""));
    }
    @Test
    void namePartialSearch() {
        assertEquals(List.of(new User("Mati"), new User("Mari")), o.partialSearchUser("Ma"));
    }

    @Test
    void namePartialSearchOneLetter() {
        assertEquals(List.of(new User("Kati"),new User("Mati"), new User("Mari"),new User("Jüri"),new User("Tiina")), o.partialSearchUser("i"));
    }
    @Test
    void findExistingBirthday() {
        assertEquals(Optional.of(LocalDate.of(2000,4, 25)),o.findBirthDay("Kati"));
    }
    @Test
    void findNonExistingBirthday() {
        assertEquals(Optional.empty(),o.findBirthDay("Tiina"));
    }
    @Test
    void findTodayBdayKid() {
        assertEquals(List.of(new User("Mari"), new User("Jüri")),o.findTodayBdayKid());
    }
}