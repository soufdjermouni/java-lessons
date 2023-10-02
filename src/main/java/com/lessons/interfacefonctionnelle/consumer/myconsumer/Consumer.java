package com.lessons.interfacefonctionnelle.consumer.myconsumer;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }

    /**
     *
     * Sans Objects.requireNonNull(other);
     * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.lessons.interfacefonctionnelle.consumer.myconsumer.Consumer.accept(Object)" because "other" is null
     * 	at com.lessons.interfacefonctionnelle.consumer.myconsumer.Consumer.lambda$andThen$0(Consumer.java:13)
     * 	at com.lessons.interfacefonctionnelle.consumer.PlayWithConsumer.main(PlayWithConsumer.java:25)
     *
     * Avec Objects.requireNonNull(other);
     *
     * Exception in thread "main" java.lang.NullPointerException
     * 	at java.base/java.util.Objects.requireNonNull(Objects.java:208)
     * 	at com.lessons.interfacefonctionnelle.consumer.myconsumer.Consumer.andThen(Consumer.java:10)
     * 	at com.lessons.interfacefonctionnelle.consumer.PlayWithConsumer.main(PlayWithConsumer.java:24)
     */
}
