package com.spring.with.tests.testing.annotation.withoutmagic;

@SuppressWarnings("LombokGetterMayBeUsed")
public class DataWithoutMagic {
    private final String stringField;

    private DataWithoutMagic(String stringField) {
        this.stringField = stringField;
    }

    public String getStringField() {
        return stringField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String stringField;

        public Builder stringField(String stringField) {
            this.stringField = stringField;
            return this;
        }

        public DataWithoutMagic build() {
            return new DataWithoutMagic(stringField);
        }
    }
}
