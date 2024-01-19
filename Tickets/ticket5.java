/*
Напишите метод rarest, который принимает Мар, ключи которого являются строками, а значения являются целыми числами, в качестве параметра. Метод возвращает целочисленное значение, которое встречается в словаре наименьшее количество раз. Если словарь не пуст, то верните меньшее целочисленное значение. Если словарь пуст, сгенерируйте исключение. Например, предположим, что словарь содержит сопоставления имен студентов(строки) и их возраста (целые числа). Ваш метод вернет наименее часто встречающийся возраст. Рассмотрим переменную словаря m, содержащую следующие пары ключ / значение:
(Alyssa=22, Char=25, Dan=25, Jeff=20, Kasey=20, Kim=20, Mogran=25, Ryan=25, Stef=22)
Три человека имеют возраст 20 лет (Джефф. Кейси и Ким), и два человека - 22 года (Алиеса и Стеф), и четыре человека - 25 лет (Чар, Дэн, Могран и Райан). Таким образом, сетод rarest (м) возвращает 22, потому что только два человека имеют этот возраст.
*/

import java.util.HashMap;
import java.util.Map;
public class RarestAge {
    public static int rarest(Map<String, Integer> ages) {
        // Проверка на пустоту словаря
        if (ages.isEmpty()) {
            throw new IllegalArgumentException("Словарь не должен быть пустым.");
        }
        // Создание словаря для подсчета частот возрастов
        Map<Integer, Integer> ageFrequencies = new HashMap<>();
        // Подсчет частот возрастов
        for (int age : ages.values()) {
            ageFrequencies.put(age, ageFrequencies.getOrDefault(age, 0) + 1);
        }
        // Нахождение наименьшего часто встречающегося возраста
        int rarestAge = ages.values().iterator().next(); // Используем первый возраст как начальное значение
        int minFrequency = Integer.MAX_VALUE; // Используем максимальное значение для сравнения
        for (Map.Entry<Integer, Integer> entry : ageFrequencies.entrySet()) {
            int frequency = entry.getValue();
            if (frequency < minFrequency) {
                minFrequency = frequency;
                rarestAge = entry.getKey();
            }
        }
        return rarestAge;
    }
}
