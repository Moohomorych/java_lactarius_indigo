/*
Напишите метод isUinique, который принимает Мар <string, string> в качестве параметра и возврашает true, если никакие два ключа не отображаются на одно и то же значение (и false, если любые два или более ключа соответствуют одному и тому же значению). Например, вызов вашего метода на следующем словаре вернет true:
(Marty Stepp, Stuart Reges, Jessica Miller, Amanda Camp, Hal Perkins)
Вызов его на следующем словаре вернул бы false из-за двух отображений для Perkins и Reges:
(Kendrick Perkins, Stuart Reges, Jessica Miller, Bruce-Reges, Hal Perkins)
Пустой словарь считается уникальным, поэтому ваш метод должен возвращать true, если передается пустой словарь.
*/

import java.util.Map;
public class UniqueMap {
    public static boolean isUnique(Map<String, String> map) {
        // Создаем пустой словарь для отслеживания уникальных значений
        Map<String, String> uniqueValues = new HashMap<>();
        // Перебираем записи в исходном словаре
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            // Проверяем, содержится ли значение в словаре уникальных значений
            if (uniqueValues.containsValue(value)) {
                // Если значение уже присутствует, возвращаем false
                return false;
            }
            // Добавляем пару ключ-значение в словарь уникальных значений
            uniqueValues.put(key, value);
        }
        // Если все значения уникальны или словарь пуст, возвращаем true
        return true;
    }
}
