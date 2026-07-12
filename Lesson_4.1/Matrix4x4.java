public class Matrix4x4 {

    public static void main(String[] args) {
        String[][] students = {
                {"Имя", "Фамилия", "Возраст", "Город"},
                {"Иван", "Петров", "25", "Москва"},
                {"Анна", "Сидорова", "30", "СПб"},
                {"Петр", "Иванов", "28", "Казань"}
        };

        try {
            int result = sumArray(students);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null) {
            throw new MyArraySizeException("Массив не инициализирован (null)");
        }

        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк: " + array.length + ". Ожидается: 4");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " имеет длину " + array[i].length + ", ожидается 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col, String value) {
        super(String.format("Неверные данные в ячейке [%d][%d]: '%s' не является числом", row, col, value));
    }
}



