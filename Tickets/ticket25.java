/*
Напишите реализацию структуры данных Stack на списке
*/

import java.util.LinkedList;
public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();
    // Добавление элемента в вершину стека
    public void push(T item) {
        list.addFirst(item);
    }
    // Извлечение элемента из вершины стека
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }
    // Получение элемента с вершины стека без удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }
    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return list.isEmpty();
    }
    // Получение размера стека
    public int size() {
        return list.size();
    }
    // Пример использования
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Добавление элементов в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Вывод размера стека
        System.out.println("Size of the stack: " + stack.size());
        // Извлечение элемента из вершины стека
        System.out.println("Popped element: " + stack.pop());
        // Вывод размера стека после извлечения элемента
        System.out.println("Size of the stack after pop: " + stack.size());
        // Получение элемента с вершины стека без удаления
        System.out.println("Peeked element: " + stack.peek());
    }
}
