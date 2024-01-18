/*
Напишите метод reverse, который принимает Мар от целых чисел к строкам в качестве параметра и возвращает новый Мар из строк к целым числам, который является «зеркальным отображением» оригинальной структуры. Риверс исходного Мар определяется здесь как новый Мар, который использует значения из оригинала в качестве своих ключей и ключи от оригинала в качестве своих значений. Поскольку значения Мар не обязательно должны быть уникальными, а его ключи обязательно должны быть уникальными, допустимо иметь любой из исходных ключей в результате в качестве значения. Другими словами, если исходный словарь имеет пары (kl, v) и (k2, v), то новый словарь должен содержать либо пару (v, kl), либо (v, k2).
*/
 
import java.util.HashMap;
import java.util.Map;
public class ReverseMap {
    public static Map<String, Integer> reverse(Map<Integer, String> originalMap) {
        Map<String, Integer> reversedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
    public static void main(String[] args) {
        // Пример использования метода reverse
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        System.out.println("Original Map: " + originalMap);
        // Вызов метода reverse
        Map<String, Integer> reversedMap = reverse(originalMap);
        System.out.println("Reversed Map: " + reversedMap);
    }
}
