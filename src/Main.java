public class Main {
    public static void main(String[] args) {

        // задача 1

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // задача 2

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        // задача 3

        double average = 0;
        if (arr.length > 1) {
            average = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}