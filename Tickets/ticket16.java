/*
Напишите метод соруStack, который принимает стек целых чисел в качестве параметра и возврашает копию оригинального стека (то есть новый стек с теми же значениями, что и у оригинала, сохраненный в том же порядке, что н оригинал). Ваш метод должен создать новый стек и заполнять его теми же значениями, которые хранятся а неходном стеке. Недопустимо возвращать тот же стек, переданный методу; Вы должны создать, заполнить и вернуть новый стек. Вы будете удалять значения из исходного стека, чтобы сделать копию, но вы долины быть уверены, что поместите их обратно в исходный стек в том же порядке, прежде чем завершите сннм работу. Другими словами, когда ваш метод будет выполнен, исходный стек должен быть восстановлен в неходное состояние, и вы вернете новый незавиеимый стек, который находится в том же состоянии. Вы можето использовать одну очередь в качестве вспомогательного хранения.
*/

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class CopyStack {
    public static Stack<Integer> copyStack(Stack<Integer> originalStack) {
        // Создание нового стека для копии
        Stack<Integer> copiedStack = new Stack<>();
        // Создание очереди для временного хранения значений
        Queue<Integer> tempQueue = new LinkedList<>();
        // Копирование значений из оригинального стека в новый стек
        while (!originalStack.isEmpty()) {
            int current = originalStack.pop();
            // Добавление значения в новый стек
            copiedStack.push(current);
            // Добавление значения в очередь для временного хранения
            tempQueue.offer(current);
        }
        // Восстановление оригинального стека из очереди
        while (!tempQueue.isEmpty()) {
            originalStack.push(tempQueue.poll());
        }
        // Возвращение копии стека
        return copiedStack;
    }
    public static void main(String[] args) {
        // Пример использования
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(5);
        originalStack.push(10);
        originalStack.push(3);
        System.out.println("Original Stack: " + originalStack);
        // Создание копии стека
        Stack<Integer> copiedStack = copyStack(originalStack);
        System.out.println("Copied Stack: " + copiedStack);
        System.out.println("Original Stack after copying: " + originalStack);
    }
}
