package lesson1.task2.util;

public abstract class Car {
    public enum Color {
        BLACK,
        RED,
        WHITE,
        GREEN,
        YELLOW
    }

    protected String mark;
    protected String model;
    protected int year;

    protected Color color;

    public Car(String mark, String model, int year, Color color) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getFullName() {
        return mark + " " + model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.hashCode() != obj.hashCode()) {
            return false;
        }

        Car car = (Car) obj;

        return year == car.year
                && (mark != null && mark.equals(car.mark))
                && (model != null && model.equals(car.model))
                && (color != null && color.equals(car.color));
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 31;

        result *= 31 + (mark == null ? 1 : mark.hashCode());
        result *= 31 + (model == null ? 1 : model.hashCode());
        result *= 31 + (color == null ? 1 : color.hashCode());
        result *= 31 + year;

        return result;
    }
}


