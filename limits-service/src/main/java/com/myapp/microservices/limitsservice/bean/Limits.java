package com.myapp.microservices.limitsservice.bean;

import lombok.Data;

@Data
public class Limits {
    private int min;
    private int max;

    protected Limits() {

    }

    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Limits{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
