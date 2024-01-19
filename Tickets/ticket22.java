/*
Напишите универсальный класс для реализации алгоритмов сортировок. В качества параметров используйте массив интерфейсных сссылок
*/

import java.util.Arrays;
import java.util.Comparator;
public class SortingAlgorithm<T extends Comparable<T>> {
    private T[] array;
    public SortingAlgorithm(T[] array) {
        this.array = array;
    }
    public void bubbleSort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Обмен элементов, если они стоят в неправильном порядке
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void quickSort() {
        quickSort(0, array.length - 1);
    }
    private void quickSort(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            quickSort(low, partitionIndex - 1);
            quickSort(partitionIndex + 1, high);
        }
    }
    private int partition(int low, int high) {
        T pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                // Обмен элементов, если они стоят в неправильном порядке
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Обмен элемента pivot и элемента на позиции i + 1
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 2, 7, 1, 6, 4};
        SortingAlgorithm<Integer> integerSort = new SortingAlgorithm<>(intArray);
        System.out.println("Original Array:");
        integerSort.printArray();
        // Применение алгоритма сортировки
        integerSort.bubbleSort();
        System.out.println("Sorted Array (Bubble Sort):");
        integerSort.printArray();
        // Восстановление исходного массива
        integerSort = new SortingAlgorithm<>(intArray);
        // Применение другого алгоритма сортировки
        integerSort.quickSort();
        System.out.println("Sorted Array (Quick Sort):");
        integerSort.printArray();
    }
}
