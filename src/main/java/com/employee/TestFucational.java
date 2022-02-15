package com.employee;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
public interface TestFucational {

    void accept(String t);

    default Consumer<String> andThen(Consumer<? super String> after) {
        Objects.requireNonNull(after);
        return (String t) -> { accept(t); after.accept(t); };
    }

    default Consumer<String> andThennew(Consumer<? super String> after) {
        Objects.requireNonNull(after);
        return (String t) -> { accept(t); after.accept(t); };
    }

    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }


    static <T> Predicate<T> isEqualNew(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
}
