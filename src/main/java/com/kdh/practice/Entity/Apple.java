package com.kdh.practice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Apple {

    private String color;
    private int weight;

    public String colorPrint() {
        return this.color;
    }

    public String weightPrint() {
        return String.valueOf(this.weight);
    }


}
