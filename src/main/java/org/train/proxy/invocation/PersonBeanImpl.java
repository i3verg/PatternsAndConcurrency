package org.train.proxy.invocation;

public class PersonBeanImpl implements PersonBean {

    String name;
    int rating;
    int ratingCount = 0;

    public PersonBeanImpl(String name, int rating, int ratingCount) {
        this.name = name;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHotOrNoRating() {
        if (rating == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setHotOrNoRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}
