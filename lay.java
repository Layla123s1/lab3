package la;



import java.util.*;



public class lay {



    // ===== main method =====

    public static void main(String[] args) {



        String[] names = {"Layla", "Sara", "Noor"};

        PrintableList<String> stringList = new PrintableList<>(names);

        stringList.printAll();



        Integer[] numbers = {10, 20, 30};

        PrintableList<Integer> intList = new PrintableList<>(numbers);

        intList.printAll();



        NumberBox<Integer> intBox = new NumberBox<>();

        intBox.setItem(5);

        System.out.println(intBox.getValue());



        NumberBox<Double> doubleBox = new NumberBox<>();

        doubleBox.setItem(3.5);

        System.out.println(doubleBox.getValue());



        List<String> namesList = Arrays.asList("A", "B", "C");

        printList(namesList);



        List<Integer> nums = Arrays.asList(1, 2, 3);

        System.out.println(sumNumbers(nums));

    }



    // ===== تكتبينهم هنا 👇 =====



    // prints any list

    public static void printList(List<?> list) {

        for (Object item : list) {

            System.out.println(item);

        }

    }



    // sums numbers

    public static double sumNumbers(List<? extends Number> list) {

        double sum = 0;

        for (Number n : list) {

            sum += n.doubleValue();

        }

        return sum;

    }

}