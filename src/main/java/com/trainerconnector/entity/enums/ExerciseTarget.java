package com.trainerconnector.entity.enums;

public enum ExerciseTarget {

    BACK("등"), CHEST("가슴"), LEG("하체"), SHOULDER("어깨"), BODY("전신");

    private final String label;

    ExerciseTarget(String label) {
        this.label = label;
    }

    public String label() {
        return label;
    }
}
