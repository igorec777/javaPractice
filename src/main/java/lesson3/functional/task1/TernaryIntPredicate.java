package lesson3.functional.task1;

@FunctionalInterface
public interface TernaryIntPredicate<T> {
    boolean test(T x, T y, T z);
}
