/*
Разработайте класс иерархию классов Комплексное число, Рациональное число. Используйте паттерн Фабрика
*/

// Интерфейс для числовых объектов
interface Number {
    void print();
}
// Класс-фабрика для создания числовых объектов
class NumberFactory {
    public Number createNumber(String type, double realPart, double imaginaryPart) {
        if ("Complex".equalsIgnoreCase(type)) {
            return new ComplexNumber(realPart, imaginaryPart);
        } else if ("Rational".equalsIgnoreCase(type)) {
            return new RationalNumber(realPart, imaginaryPart);
        }
        // В случае неизвестного типа возвращаем null или выбрасываем исключение
        return null;
    }
}
// Конкретная реализация комплексного числа
class ComplexNumber implements Number {
    private double realPart;
    private double imaginaryPart;
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    @Override
    public void print() {
        System.out.println("Complex Number: " + realPart + " + " + imaginaryPart + "i");
    }
}
// Конкретная реализация рационального числа
class RationalNumber implements Number {
    private double numerator;
    private double denominator;
    public RationalNumber(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public void print() {
        System.out.println("Rational Number: " + numerator + " / " + denominator);
    }
}
// Пример использования
public class NumbersApp {
    public static void main(String[] args) {
        NumberFactory numberFactory = new NumberFactory();
        // Создаем комплексное число с помощью фабрики
        Number complexNumber = numberFactory.createNumber("Complex", 3.0, 4.0);
        // Выводим комплексное число
        complexNumber.print();
        // Создаем рациональное число с помощью фабрики
        Number rationalNumber = numberFactory.createNumber("Rational", 5.0, 2.0);
        // Выводим рациональное число
        rationalNumber.print();
    }
}
