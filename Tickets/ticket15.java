/*
Напишите метод splitStack, который принимает стек целых чисел в качестве параметра и разбивает его на отрицательные и неотрицательные значения. Числа в стеке должны быть переставлены так, чтобы все отрицательные значения появлялись в нижней части стека, а все неотрицательные - в верхней части. Другими словами, если после вызова этого метода вам нужно будет вытолкнуть числа из стека, вы сначала получите все неотрицательные числа, а затем получите все отрицательные числа. Неважно, в каком порядке появляются числа, если все отрицательные находятся в стеке всегда ниже, чем все неотрицательные числа. Вы можете использовать одну очередь в качестве вспомогательного хранения.
*/

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        // Создание очереди для временного хранения отрицательных чисел
        Queue<Integer> negativeQueue = new LinkedList<>();
        // Перебор элементов стека
        while (!stack.isEmpty()) {
            int current = stack.pop();
            // Если число отрицательное, добавляем в очередь
            if (current < 0) {
                negativeQueue.offer(current);
            } else {
                // Если число неотрицательное, добавляем в верх стека
                stack.push(current);
            }
        }
        // Перенос отрицательных чисел обратно в стек
        while (!negativeQueue.isEmpty()) {
            stack.push(negativeQueue.poll());
        }
    }
    public static void main(String[] args) {
        // Пример использования
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(10);
        stack.push(-8);
        stack.push(3);
        System.out.println("Original Stack: " + stack);
        splitStack(stack);
        System.out.println("Split Stack: " + stack);
    }
}
