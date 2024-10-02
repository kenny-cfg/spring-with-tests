package com.spring.with.tests.testing.annotation.withoutmagic;

import lombok.val;

public class BuilderExample {
    public int integer;
    public String stringValue;

    public static BuilderExample.Builder builder() {
        return new Builder();
    }

    public static class Builder {
        public int integer;
        public String stringValue;

        public Builder integer(int integer) {
            this.integer = integer;
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public BuilderExample build() {
            val returnValue = new BuilderExample();
            returnValue.integer = integer;
            returnValue.stringValue = stringValue;
            return returnValue;
        }
    }
}
