public class HomeworkAll {

    // ==================== ЗАДАНИЕ 1 ====================
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // ==================== ЗАДАНИЕ 2 ====================
    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // ==================== ЗАДАНИЕ 3 ====================
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // ==================== ЗАДАНИЕ 4 ====================
    public static void compareNumbers() {
        int a = 6;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // ==================== ЗАДАНИЕ 5 ====================
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // ==================== ЗАДАНИЕ 6 ====================
    public static void checkNumber(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    // ==================== ЗАДАНИЕ 7 ====================
    public static boolean checkValue(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // ==================== ЗАДАНИЕ 8 ====================
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // ==================== ЗАДАНИЕ 9 ====================
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // ==================== ЗАДАНИЕ 10 ====================
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.print("Исходный массив: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.print("Измененный массив: ");
        printArray(array);
    }

    // Вспомогательный метод для печати массива (для задания 10)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ==================== ЗАДАНИЕ 11 ====================
    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.print("Массив 1-100: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // ==================== ЗАДАНИЕ 12 ====================
    public static void multiplyLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.print("Результат: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ==================== ЗАДАНИЕ 13 ====================
    public static void fillDiagonal() {
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }

        System.out.println("Диагональная матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // ==================== ЗАДАНИЕ 14 ====================
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // ============================================================
    // ГЛАВНЫЙ МЕТОД main для проверки всех заданий
    // ============================================================
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1 ===");
        printThreeWords();

        System.out.println("\n=== ЗАДАНИЕ 2 ===");
        checkSumSign();

        System.out.println("\n=== ЗАДАНИЕ 3 ===");
        printColor();

        System.out.println("\n=== ЗАДАНИЕ 4 ===");
        compareNumbers();

        System.out.println("\n=== ЗАДАНИЕ 5 ===");
        System.out.println("isSumInRange(5, 10) = " + isSumInRange(5, 10));
        System.out.println("isSumInRange(1, 2) = " + isSumInRange(1, 2));

        System.out.println("\n=== ЗАДАНИЕ 6 ===");
        checkNumber(-5);
        checkNumber(0);
        checkNumber(10);

        System.out.println("\n=== ЗАДАНИЕ 7 ===");
        System.out.println("checkValue(-11) = " + checkValue(-11));
        System.out.println("checkValue(5) = " + checkValue(5));

        System.out.println("\n=== ЗАДАНИЕ 8 ===");
        printStringMultipleTimes("Привет, мир!", 3);

        System.out.println("\n=== ЗАДАНИЕ 9 ===");
        System.out.println("isLeapYear(2020) = " + isLeapYear(2020));
        System.out.println("isLeapYear(1900) = " + isLeapYear(1900));
        System.out.println("isLeapYear(2000) = " + isLeapYear(2000));
        System.out.println("isLeapYear(2026) = " + isLeapYear(2026));

        System.out.println("\n=== ЗАДАНИЕ 10 ===");
        invertArray();

        System.out.println("\n=== ЗАДАНИЕ 11 ===");
        fillArray();

        System.out.println("\n=== ЗАДАНИЕ 12 ===");
        multiplyLessThanSix();

        System.out.println("\n=== ЗАДАНИЕ 13 ===");
        fillDiagonal();

        System.out.println("\n=== ЗАДАНИЕ 14 ===");
        int[] result = createArray(5, 10);
        System.out.print("Массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
