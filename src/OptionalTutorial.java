import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.Month.*;

public class OptionalTutorial {

    private static List<User> users = List.of(
            new User("Kati", LocalDate.of(2000, APRIL, 25)),
            new User("Mati", LocalDate.of(1996, JANUARY, 8)),
            new User("Mari", LocalDate.now()),
            new User("Jüri", LocalDate.now()),
            new User("Tiina"),
            new User("Kalev", LocalDate.of(2000, APRIL, 25))
    );

    public static Optional<User> searchUser(String name) {

        return users.stream().filter(user -> user.name.equals(name)).findAny();

//
//        User result = null;
//        for (User u : users) {
//            if (Objects.equals(u.name, name)) {
//                result = u;
//                break;
//            }
//        }
//        return Optional.ofNullable(result);
    }

    public List<User> partialSearchUser(String name) {
        return users.stream().filter(user -> user.name.contains(name)).toList();
//
//        List<User> results = new ArrayList<>();
//        for (User u : users) {
//            if (u.name.contains(name)) {
//                results.add(u);
//            }
//        }
//        return results;
    }

    public static void printNameIfExists(String name) {

        if (searchUser(name).equals(Optional.empty())) {
            System.out.println("Not found");
        } else {
            System.out.println("Minu nimi on " + name);
        }
    }

    Optional<LocalDate> findBirthDay(String name) {
        return searchUser(name).map(user -> user.birthDay);
//        LocalDate result = null;
//        for (User u : users) {
//            if (Objects.equals(u.name, name)) {
//                result = u.birthDay;
//                break;
//            }
//        }
//
//        return Optional.ofNullable(result);
    }

    List<User> findTodayBdayKid() {
        return users.stream()
                .filter(user -> user.birthDay != null)
                .filter(user -> user.birthDay.getDayOfMonth() == LocalDate.now().getDayOfMonth())
                .filter(user -> user.birthDay.getMonthValue() == LocalDate.now().getMonthValue()).toList();


//        int currentMonth = LocalDate.now().getMonthValue();
//        int currentDayofMonth = LocalDate.now().getDayOfMonth();
//        List<User> isBirthdayKid = new ArrayList<>();
//        for (User u : users) {
//            if (currentMonth == u.birthDay.getMonthValue() &&
//                    currentDayofMonth == u.birthDay.getDayOfMonth()) {
//                isBirthdayKid.add(u);
//            }
//        }
//        return isBirthdayKid;
    }
}