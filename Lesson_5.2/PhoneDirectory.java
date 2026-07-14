import java.util.*;

public class PhoneDirectory {

        private Map<String, List<String>> phoneBook;
        public PhoneDirectory() {
            phoneBook = new HashMap<>();
        }

        public void add(String surname, String phone) {

            if (!phoneBook.containsKey(surname)) {
                List<String> numbers = new ArrayList<>();
                numbers.add(phone);
                phoneBook.put(surname, numbers);
            } else {

                phoneBook.get(surname).add(phone);
            }
        }

        public void get(String surname) {
            if (phoneBook.containsKey(surname)) {
                System.out.println("Номер для " + surname + ":");
                for (String number : phoneBook.get(surname)) {
                    System.out.println(number);;
            }
        } else {
                System.out.println("Абонент не найден.");
            }
        }

    }

