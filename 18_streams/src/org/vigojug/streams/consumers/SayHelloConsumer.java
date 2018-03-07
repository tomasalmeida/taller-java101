package org.vigojug.streams.consumers;

import java.util.function.Consumer;

public class SayHelloConsumer implements Consumer<String> {

    public void accept(final String name) {
        System.out.println("hello " + name);
    }
}
