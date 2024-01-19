/*
Разработайте класс иерархию классов Геометрическая фигура, Прямоугольник, Круг. Используйте паттерн Фабрика
*/

// Интерфейс для всех геометрических фигур
interface GeometricShape {
    void draw();
}
// Класс-фабрика для создания геометрических фигур
class ShapeFactory {
    public GeometricShape createShape(String type) {
        if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        // В случае неизвестного типа возвращаем null или выбрасываем исключение
        return null;
    }
}
// Конкретная реализация прямоугольника
class Rectangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
// Конкретная реализация круга
class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
// Пример использования
public class GeometryApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // Создаем прямоугольник с помощью фабрики
        GeometricShape rectangle = shapeFactory.createShape("Rectangle");
        // Рисуем прямоугольник
        rectangle.draw();
        // Создаем круг с помощью фабрики
        GeometricShape circle = shapeFactory.createShape("Circle");
        // Рисуем круг
        circle.draw();
    }
}
