import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ListTutorial {

    int sumOfList(List<Integer> list) {
//        int sum = 0;
//        for (int integer : list) {
//            sum += integer;
//        }
//        return sum;


//        return list.stream().collect(Collectors.summingInt(Integer -> {
//            if (Integer == null) {
//                return 0;
//            }
//            return Integer.intValue();
//        }));


        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();

    }

    List<Integer> concatLists(List<Integer> list1, List<Integer> list2) {

//        List<Integer> newList = new ArrayList<>();
//        newList.addAll(list1);
//        newList.addAll(list2);
//
//        return newList;

        return Stream.concat(list1.stream(), list2.stream()).toList();
    }

    List<Integer> reverseList(List<Integer> list1) {

//        List<Integer> reversedList = new ArrayList<>();
//        for (int i = list1.size() - 1; i >= 0; i--) {
//            reversedList.add(list1.get(i));
//        }
//        return reversedList;
//
        Collections.reverse(list1);
        return list1;

//        return list1.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//            Collections.reverse(list);
//            return list.stream().toList();
//        }));

    }

    List<Integer> sortList(List<Integer> list1) {

        List<Integer> sortedList = new ArrayList<>();



        return new ArrayList<>();
    }


}



