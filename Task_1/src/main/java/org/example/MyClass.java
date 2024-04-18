package org.example;

public class MyClass {
    private int field1;
    private String field2;
    private double field3;

    public int getField1() {
        return field1;
    }

    public void setField1(int value) {
        // Валидация значения
        if (value >= 0) {
            field1 = value;
        } else {
            System.out.println("Значение должно быть неотрицательным.");
        }
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String value) {
        // Валидация значения
        if (value != null && !value.isEmpty()) {
            field2 = value;
        } else {
            System.out.println("Значение не может быть пустым.");
        }
    }

    public double getField3() {
        return field3;
    }

    public void setField3(double value) {
        // Валидация значения
        if (value > 0) {
            field3 = value;
        } else {
            System.out.println("Значение должно быть положительным.");
        }
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Вывод информации о класслоадере и имени класса
        ClassLoader classLoader = myObject.getClass().getClassLoader();
        String className = myObject.getClass().getName();
        System.out.println("Класслоадер: " + classLoader);
        System.out.println("Имя класса: " + className);
    }
}