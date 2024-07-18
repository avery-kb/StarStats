package com.StarData;


public class StarDataTools {

    public static Double goldPerDay(StarData data) {
        double maxHarvests = data.getRegrow() != 0 ? Math.floor((28 - data.getDays()) / data.getRegrow()) : 1;
        double sellPerHarvest = data.getSell().getFirst() * data.getHarvest();

        double growingDays = Math.floor(data.getDays() + ((maxHarvests - 1) * data.getRegrow()));
        double cost = data.getCost().isEmpty() ? 0 : data.getCost().getFirst();

        return ((maxHarvests * sellPerHarvest) - cost) / growingDays;
    }
}
