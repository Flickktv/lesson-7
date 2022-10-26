import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    //1

    public static void determineYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - невисокосный год.");
        }
    }

    //2

    public static void phoneVersion(int operationSystem, int yearMobile){
        int currentYear = LocalDate.now().getYear();
        if (operationSystem == 0 && yearMobile < currentYear){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (operationSystem == 1 && yearMobile < currentYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operationSystem == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    //3

    public static void numberDays(int distance){
        if (distance < 20) {
            System.out.println("Потребуется дней: " + 1);
        }
        else {
            System.out.println("Потребуется дней: " + ((distance - 20) / 40 + 2));
        }
    }

    //4

    public static void checkDoubles(String s) {
        boolean flag = true;
        char a = ' ';
        for (int i = 0; i < s.length() - 1 && flag; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && flag){
                flag = false;
                System.out.println("Дубль обнаружен: " + s.charAt(i));
            }
        }
        if (flag) {
            System.out.println("Дублей не обнаружено");
        }
    }

    //5


    public static void reverseNumbers(int[] numbers){
        int a = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            a = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = a;
        }
    }

    //6

    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int sum(int[] arr1, int count){
        int total = 0;
        for (int i = 0; i < count + 1; i++) {
            total = total + arr1[i];
        }
        return total;
    }

    public static double mid(double sum, int count){
        double mid = sum / (count + 1);
        return mid;
    }

    public static void main(String[]args) {

        int year = 2021;
        determineYear(year);

        int deviceYear = 2022;
        int system = 0;
        phoneVersion(system, deviceYear);

        int distance = 150;
        numberDays(distance);

        String s = "aabccddefgghiijjkk";
        checkDoubles(s);

        int[] numbers = {3, 2, 1, 6, 5};
        reverseNumbers(numbers);
        System.out.println(Arrays.toString(numbers));

        double b = 0;
        for (int i = 0; i < arr.length; i++) {
            b = mid(sum(arr, i), i);
        }
        System.out.println(b);


    }
}