/*
Напишите метод под названием alternate, который принимает два списка целых чисел в качестве параметров и возвращает новый список, содержащий чередующиеся элементы из двух списков, в следующем порядке:
• 1-ый элемент из 1-ого списка
• 1-ый элемент из 2-ого списка
• 2-ой элемент из 1-ого списка
• 2-ой элемент из 2-ого списка 
• 3-ий элемент из 1-ого списка
• 3-ий элемент из 2-ого списка
Если списки не содержат одинаковое количество элементов, оставшиеся элементы из более длинного списка должны быть расположены последовательно в конце.
Например, для первого списка (1, 2, 3, 4, 5) и второго списка (6, 7, 8, 9, 10, 11, 12) вызов alternate (list1, list2) должен вернуть список, содержащий (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12). Не изменяйте передаваемые списки параметров.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Alternate {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list1 = enterListFromKeyboard("Введите элементы первого списка (для завершения введите 'stop'): ");
        List<Integer> list2 = enterListFromKeyboard("Введите элементы второго списка (для завершения введите 'stop'): ");
        List<Integer> result = alternate(list1, list2);
        System.out.println(result);
    }
    private static List<Integer> enterListFromKeyboard(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        List<Integer> inputList = new ArrayList<>();
        String input;
        while (!(input = scanner.next()).equalsIgnoreCase("stop")) {
            try {
                int inputValue = Integer.parseInt(input);
                inputList.add(inputValue);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число или 'stop' для завершения.");
            }
        }
        return inputList;
    }
}
