package models;

public class Sneaker {

    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    public Sneaker(){}

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }


}