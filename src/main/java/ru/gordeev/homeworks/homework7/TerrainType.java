package ru.gordeev.homeworks.homework7;

public enum TerrainType {

    DEEP_FOREST("густой лес"), FLATLAND("равнина"), SWAMP("болото");

    private String type;

    TerrainType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
