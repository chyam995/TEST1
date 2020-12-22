/**
 * @see #NewYearGift(String, Double, int)
 */

package ru.appline.model;

public class Jellybean  extends NewYearGift {

        private String madeIn;

    public Jellybean(String name, Double price, int weight,String madeIn) {
        super(name, price, weight);
        this.madeIn = madeIn;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Jellybean{" +super.toString()+
                ",madeIn='" + madeIn + '\'' +
                '}';
    }
}
