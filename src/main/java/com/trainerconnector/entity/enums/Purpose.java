package com.trainerconnector.entity.enums;

public enum Purpose {

    DIET("다이어트");

    private final String label;

    Purpose(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}
