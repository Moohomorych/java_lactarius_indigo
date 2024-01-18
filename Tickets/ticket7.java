/*
Напишите метод removeAll, который можно добавить в класс LinkedIntList. Метод должен эффективно удалить из отсортированного списка целых чисел все значения, появляющиеся во втором отсортированном списке целых чисел. Например, предположим, что переменные LinkedIntList listl и list2 ссылаются на следующие списки:
list1: [1, 3, 5, 7]
list2: [1, 2, 3, 4, 5]
Если была вызвана listl.removeAll (list2); то, списки должны хранить следующие значения после вызова:
list1: [7]
list2: [1, 2, 3, 4, 5]
Обратите внимание, что все значения из list1, которые появляются в list2, были удалены, a list2 не изменился. Если бы вместо этого был вызов list2.removeAll (listl); списки будут иметь следующие значения:
listI: [1, 3, 5, 7]
list2: [2, 4]
Оба списка гарантированно находятся в отсортированном (неубывающем) порядке, хотя в любом списке могут быть дубликаты. Поскольку списки отсортированы, вы можете решить эту проблему очень эффективно за один проход данных. Ваше решение должно выполняться за время О (М + N), где М и N - длины двух списков. Предположим, что мы добавляем этот метод в класс LinkedIntList, как показано ниже. Вы не можете вызывать какие-либо другие методы класса для решения этой задачи, вы не можете создавать новые узлы и не можете использовать какие-либо вспомогательные структуры данных для решения этой проблемы (например, массив, ArrayList, Queue, String и т. Д.). Вы также не можете изменять какие-либо поля данных узлов. Вы должны решить эту задачу, переставив ссылки на списки.
public class LinkedIntList {
  private ListNode front;
  ...
}
public class ListNode {
  public int data;
  public ListNode next;
  ...
}
*/
