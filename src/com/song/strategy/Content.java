package com.song.strategy;

public class Content {

    private IStrategy iStrategy;

    public Content(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate(){
        iStrategy.operate();
    }

}
