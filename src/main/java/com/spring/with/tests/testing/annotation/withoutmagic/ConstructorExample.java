package com.spring.with.tests.testing.annotation.withoutmagic;

@SuppressWarnings({"LombokGetterMayBeUsed", "LombokSetterMayBeUsed"})
public class ConstructorExample {
    private final int integerValue;
    private String stringValue;

    public ConstructorExample(int integerValue) {
        this.integerValue = integerValue;
    }

    public ConstructorExample(String stringValue, int integerValue) {
        this.integerValue = integerValue;
        this.stringValue = stringValue;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
