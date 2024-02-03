package com.example.index.domain.enums;

public enum IndependentPostType {
    CLEAN("청소"), WASH("세탁"), COOK("요리"), HEALTH("건강"), ETC("기타");
    private final String description;
    IndependentPostType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
