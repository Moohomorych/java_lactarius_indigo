/*
Напишите метод с именем guavaSort, который принимает массив строк в качестве параметра и упорядочивает строки в массиве в отсортированном порядке возрастания. В частности, ваш алгоритм сортировки должен использовать FJC для Multiset или Multimap для реализации варианта алгоритма блочной сортировки, который будет работать со строками. Используйте коллекцию FJC для подсчета вхождений строк, аналогично тому, как это делается в блочной сортировке, а затем поместите эти строки обратно в массив в отсортированном порядке. Например, предположим, что вашему методу передается следующий массив:
[Farm, Zoo, Car, Apple, Bee, Golf, Bee, Dog, Golf, Zoo, Zoo, Bee, Bee, Apple]
Ваша коллекция должна хранить следующие вхождения строк:
[Apple x 2, Bee x 4, Car, Dog, Farm, Golf x 2, Zoo x 3]
Что вы должны использовать, чтобы поместить строки обратно в массив в отсортированном порядке:
[Apple, Apple, Bee, Bee, Bee, Bee, Car, Dog, Farm, Golf, Golf, Zoo, Zoo, Zoo]
Ваш код должен выполняться за время О (N log N) и использовать память О (N), где N - количество элементов в массиве. Вы можете предположить, что переданный массив и все строки в нем не равны нулю. Не используйте никаких других вспомогательных коллекций, кроме одного Multiset или Multimap.
*/

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.Arrays;
public class GuavaSort {
    public static void guavaSort(String[] array) {
        // Используем FJC Multiset для подсчета вхождений строк
        Multiset<String> multiset = HashMultiset.create(Arrays.asList(array));
        int index = 0;
        // Помещаем строки обратно в массив в отсортированном порядке
        for (Multiset.Entry<String> entry : multiset.entrySet()) {
            String value = entry.getElement();
            int count = entry.getCount();
            // Заполняем массив соответствующим числом вхождений строки
            Arrays.fill(array, index, index + count, value);
            // Обновляем индекс для следующей строки
            index += count;
        }
    }
}
