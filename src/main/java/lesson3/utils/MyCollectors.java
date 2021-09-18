package lesson3.utils;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static lesson3.utils.WordsHandler.isPalindrome;


public class MyCollectors {

     private static class CollectorImpl<T, A, R> implements Collector<T, A, R> {

        private final Supplier<A> supplier;
        private final BiConsumer<A, T> accumulator;
        private final BinaryOperator<A> combiner;
        private final Function<A, R> finisher;
        private final Set<Characteristics> characteristics;

        private CollectorImpl(Supplier<A> supplier,
                      BiConsumer<A, T> accumulator,
                      BinaryOperator<A> combiner,
                      Function<A,R> finisher,
                      Set<Characteristics> characteristics) {

            this.supplier = supplier;
            this.accumulator = accumulator;
            this.combiner = combiner;
            this.finisher = finisher;
            this.characteristics = characteristics;
        }

        @Override
        public Supplier<A> supplier() {
            return supplier;
        }

        @Override
        public BiConsumer<A, T> accumulator() {
            return accumulator;
        }

        @Override
        public BinaryOperator<A> combiner() {
            return combiner;
        }

        @Override
        public Function<A, R> finisher() {
            return finisher;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return characteristics;
        }
    }

    public static Collector<Integer, ?, Long> countSumOfNumbersSquare() {
        return new CollectorImpl<>(
                () -> new long[1],
                (arr, val) -> arr[0] += (long) val * val,
                null,
                arr -> arr[0],
                Set.of(Collector.Characteristics.UNORDERED));
    }

    public static Collector<String, Map<Boolean, List<String>>, Map<Boolean, List<String>>> partitioningByPalindromes() {
         return new CollectorImpl<>(
                 () -> {
                     Map<Boolean, List<String>> map = new HashMap<>();
                     map.put(true, new ArrayList<>());
                     map.put(false, new ArrayList<>());
                     return map;
                 },
                 (map, str) -> map.get(isPalindrome(str)).add(str),
                 null,
                 Function.identity(),
                 Set.of(Collector.Characteristics.IDENTITY_FINISH, Collector.Characteristics.UNORDERED));
    }

    public static Collector<Integer, List<Integer>, List<Integer>> transformNumbers(List<IntUnaryOperator> operators) {
         return new CollectorImpl<>(
                 ArrayList::new,
                 (newInts, val) -> {
                     for (IntUnaryOperator op : operators) {
                         val = op.applyAsInt(val);
                     }
                     newInts.add(val);
                 },
                 null,
                 Function.identity(),
                 Set.of(Collector.Characteristics.IDENTITY_FINISH, Collector.Characteristics.UNORDERED));
    }
}
