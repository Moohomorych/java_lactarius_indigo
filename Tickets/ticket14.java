/*
Напишите метод equals, который принимает в качестве параметров два стека целых чисел, метод возвращает true, если два стека равны, и в противном случае возвращает false. Чтобы считаться равными, два стека должны хранить одинаковую последовательность целочисленных значений в одном и том же порядке. Ваш метод заключается в проверке двух стеков, но перед завершением работы метода необходимо вернуть их в исходное состояние. Вы можете использовать один стек в качестве вспомогательногохранения.
*/

import java.util.Stack;
public class StackEquality {
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        // Проверка на размер стеков
        if (stack1.size() != stack2.size()) {
            restoreStacks(stack1, stack2);
            return false;
        }
        // Создание вспомогательного стека
        Stack<Integer> tempStack = new Stack<>();
        // Проверка на равенство элементов в стеках
        while (!stack1.isEmpty()) {
            int element1 = stack1.pop();
            int element2 = stack2.pop();
            if (element1 != element2) {
                // Восстановление стеков и возврат false
                restoreStacks(stack1, stack2, tempStack);
                return false;
            }
            // Помещение элементов обратно в стеки
            tempStack.push(element1);
        }
        // Восстановление стеков
        restoreStacks(stack1, stack2, tempStack);
        // Стеки равны
        return true;
    }
    // Восстановление стеков после сравнения
    private static void restoreStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.isEmpty()) {
            stack1.pop();
        }
        while (!stack2.isEmpty()) {
            stack2.pop();
        }
    }
    // Восстановление стеков с использованием вспомогательного стека
    private static void restoreStacks(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> tempStack) {
        while (!tempStack.isEmpty()) {
            int element = tempStack.pop();
            stack1.push(element);
            stack2.push(element);
        }
    }
    public static void main(String[] args) {
        // Пример использования
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        boolean result = equals(stack1, stack2);
        System.out.println("Stacks are equal: " + result);
    }
}
