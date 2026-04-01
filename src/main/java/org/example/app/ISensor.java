package org.example.app;

import java.util.function.Consumer;

public interface ISensor {
    void onDetect(Consumer<String> callback);
}
