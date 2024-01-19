/*
Напишите реализацию структуры данных Stack на массиве. При реализации необходимо использовать дженерики
*/

import java.util.EmptyStackException;
public class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;
    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public void push(T element) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = element;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = (T) array[--size];
        array[size] = null; // to avoid memory leaks
        return element;
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[size - 1];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = java.util.Arrays.copyOf(array, newCapacity);
    }
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of the stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
