/**
 * @see #NewYearGift(String, Double, int)
 */

package ru.appline.model;


public class Candy extends NewYearGift {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Candy(String name, Double price, int weight, String type) {
        super(name,price,weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy{" +super.toString()+
                ",type='" + type + '\'' +
                '}';
    }
}
