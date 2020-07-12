package com.entity;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Product extends ArrayList<Product> {



  public int   ID;
    public String name;
    public int shelf;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelflife() {
        return shelf;
    }

    public void setShelflife(int shelflife) {
        this.shelf = shelflife;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }
}

