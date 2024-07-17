package com.StarData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StarData {
    private String name;
    private List<Double> cost;
    private Double days;
    private Double regrow;
    private Double harvest;
    private List<Double> sell;
    private List<String> season;
    private List<Double> energy;
    private List<Double> health;
}