/*
Напишите универсальный класс для реализации алгоритмов поиска. В качества параметров используйте массив интерфейсных ссылок
*/

public class SearchAlgorithm<T extends Comparable<T>> {
    private T[] array;
    public SearchAlgorithm(T[] array) {
        this.array = array;
    }
    public int linearSearch(T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;  // Найдено совпадение, возвращаем индекс
            }
        }
        return -1;  // Элемент не найден
    }
    public int binarySearch(T target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = array[mid].compareTo(target);
            if (cmp == 0) {
                return mid;  // Найдено совпадение, возвращаем индекс
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;  // Элемент не найден
    }
    // Другие методы поиска можно добавить по необходимости
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SearchAlgorithm<Integer> integerSearch = new SearchAlgorithm<>(intArray);
        int resultLinear = integerSearch.linearSearch(5);
        System.out.println("Linear Search Result: " + resultLinear);
        int resultBinary = integerSearch.binarySearch(5);
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
