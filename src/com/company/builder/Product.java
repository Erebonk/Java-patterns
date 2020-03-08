package com.company.builder;

import java.math.BigDecimal;

public class Product {

    private final long id;

    private final String name;

    private final String fullName;

    private final BigDecimal price;

    public static class Builder {

        private final long id;

        private final String name;

        private String fullName = "NONE";

        private BigDecimal price = BigDecimal.ZERO;

        public Builder (long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder fullname(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fullName = builder.fullName;
        this.price = builder.price;
    }

}
