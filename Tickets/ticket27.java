/*
Напишите реализацию структуры ArrayList на массиве.
*/

import java.util.AbstractList;
import java.util.Arrays;
public class ArrayList<T> extends AbstractList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;
    // Конструктор по умолчанию
    public ArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    // Добавление элемента в конец списка
    @Override
    public boolean add(T item) {
        ensureCapacity();
        array[size++] = item;
        return true;
    }
    // Получение элемента по индексу
    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }
    // Установка значения элемента по индексу
    @Override
    public T set(int index, T item) {
        checkIndex(index);
        T oldValue = (T) array[index];
        array[index] = item;
        return oldValue;
    }
    // Удаление элемента по индексу
    @Override
    public T remove(int index) {
        checkIndex(index);
        T removedValue = (T) array[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }
        array[--size] = null; // Освобождаем последний элемент и уменьшаем размер
        return removedValue;
    }
    // Получение размера списка
    @Override
    public int size() {
        return size;
    }
    // Убеждаемся, что массив достаточно велик для хранения элементов
    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
    // Проверка индекса на корректность
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    // Пример использования
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // Добавление элементов в список
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        // Вывод элементов списка
        System.out.println("Elements in the ArrayList: " + arrayList);
        // Получение элемента по индексу
        System.out.println("Element at index 1: " + arrayList.get(1));
        // Установка нового значения элемента по индексу
        arrayList.set(1, "NewTwo");
        System.out.println("Updated ArrayList: " + arrayList);
        // Удаление элемента по индексу
        arrayList.remove(0);
        System.out.println("ArrayList after removal: " + arrayList);
    }
}
