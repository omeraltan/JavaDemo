package com.omer.collections;

public class Vehicle {
    private String brand;
    private String model;
    private Integer year;
    private Long price;

    public Vehicle(String brand, String model, Integer year, Long price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", price=" + price +
            '}';
    }
}

