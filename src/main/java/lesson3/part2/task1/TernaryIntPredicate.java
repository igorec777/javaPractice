package lesson3.part2.task1;

@FunctionalInterface
public interface TernaryIntPredicate<T> {
    boolean test(T x, T y, T z);
}
