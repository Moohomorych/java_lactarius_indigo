/*
Напишите метод longestSortedSequence, который возвращает длину самой длинной последовательности в списке целых отсортированной чисел, Например, если переменная с именем list хранит следующую последовательность значений:
[1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17]
тогда вызов: list.longestSortedSequence () вернет значение 4, поскольку это длина самой длинной отсортированной последовательности в этом списке (последовательность -3, 0, 42, 308). Если список пуст, ваш метод должен вернуть 0. Обратите внимание, что для непустого списка метод всегда будет возвращать значение по крайней мере 1, потому что любой отдельный элемент составляет отсортированную последовательность.
public class ArrayIntList {
  private int[] elementData;
  private int size;
  
  // your code goes here
}
*/

public class ArrayIntList {
    private int[] elementData;
    private int size;
    public int longestSortedSequence() {
        if (size == 0) {
            // Если список пуст, вернуть 0
            return 0;
        }
        int longestSequence = 1;  // Минимальная длина последовательности - 1
        int currentSequence = 1;  // Текущая длина последовательности
        // Проход по списку, начиная со второго элемента
        for (int i = 1; i < size; i++) {
            // Проверка, является ли текущий элемент следующим в отсортированной последовательности
            if (elementData[i] >= elementData[i - 1]) {
                // Увеличение длины текущей последовательности
                currentSequence++;
            } else {
                // Сброс длины текущей последовательности
                currentSequence = 1;
            }
            // Обновление самой длинной последовательности
            longestSequence = Math.max(longestSequence, currentSequence);
        }
        return longestSequence;
    }
}
