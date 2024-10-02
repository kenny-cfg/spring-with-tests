package com.spring.with.tests.testing.annotation.withoutmagic;

@SuppressWarnings({"LombokGetterMayBeUsed", "LombokSetterMayBeUsed"})
public class GetterSetterExampleWithoutMagic {
    private int integer;
    private String string;

    public int getInteger() {
        return integer;
    }

    public String getString() {
        return string;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setString(String string) {
        this.string = string;
    }
}
