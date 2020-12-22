package ru.appline.model;

public abstract class NewYearGift {
    private String name;
    private Double price;
    private int weight;

    public NewYearGift(String name, Double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name= '" + name +"\'" +
                ", price=" + price +
                ", weight=" + weight ;
    }
}
