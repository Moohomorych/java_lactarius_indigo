/*
Напишите метод firstLast, который можно добавить в класс LinkedintList, который перемещает элемент списка в конец списка. Предположим, что переменная LinkedIntList с именем list хранит первый следующие элементы спереди (слева) и сзади (справа):
[18, 4, 27, 9, 54, 5, 63]
Если вы сделали вызов list. firstLast ();, список будет хранить элементы в следующем порядке:
[4, 27, 9, 54, 5, 63, 18]
Если список пуст или содержит только один элемент, его содержимое не должно изменяться.
Соблюдайте следующие ограничения в вашем решении:
  •Не вызывайте никакие другие методы объекта LinkedIntList, такие как add, remove или size.
  •Не создавайте новые объекты ListNode (хотя у вас может быть столько переменных ListNode, сколько вам нужно). Не используйте другие структуры данных, такие как массивы, списки, очереди и т. д.
  •Не изменяйте данные любого существующего узла; изменять список только путем изменения ссылок между узлами.
Ваше решение должно выполняться за время О (N), где N - количество элементов в связанном списке. Предположим, что вы добавляете этот метод в класс LinkedIntList (который использует класс ListNode) как показано ниже:
public class LinkedIntList {
...
{
public class ListNode {
  public int data;
  public ListNode next;
  ...
}
*/
