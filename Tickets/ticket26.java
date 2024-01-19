/*
Напишите реализацию структуры ArrayList на списке
*/

import java.util.AbstractList;
import java.util.LinkedList;
public class ArrayList<T> extends AbstractList<T> {
    private LinkedList<T> list = new LinkedList<>();
    // Добавление элемента в конец списка
    @Override
    public boolean add(T item) {
        return list.add(item);
    }
    // Получение элемента по индексу
    @Override
    public T get(int index) {
        checkIndex(index);
        return list.get(index);
    }
    // Установка значения элемента по индексу
    @Override
    public T set(int index, T item) {
        checkIndex(index);
        return list.set(index, item);
    }
    // Удаление элемента по индексу
    @Override
    public T remove(int index) {
        checkIndex(index);
        return list.remove(index);
    }
    // Получение размера списка
    @Override
    public int size() {
        return list.size();
    }
    // Проверка индекса на корректность
    private void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
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
