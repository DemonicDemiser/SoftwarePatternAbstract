package com.company;

public interface Instance {
    enum videoQuality {low, medium, high}

    void start();

    void videoStorage(Storage storage);

    void stop();

}
