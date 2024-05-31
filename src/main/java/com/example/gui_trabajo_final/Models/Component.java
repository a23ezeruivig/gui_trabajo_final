package com.example.gui_trabajo_final.Models;

public class Component {
    /*
    private enum Color { Amarillo, Azul, Blanco, Gris, Negro, Naranja, Rojo, Rosa, Verde, Violeta }
    private enum NameComponent { Keycaps, PCB, Plate, Case, Switches }
    private enum Percentage { 40, 60, 65, 75, 80, 100 }
    */
    private int id;
    private String name;
    private int percentage;
    private String color;
    private float price;

    // Constructor
    public Component(int id, String name, int percentage, String color, float price) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.price = price;
        this.color = color;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getPercentage() { return percentage; }
    public float getPrice() { return price; }
    public String getColor() { return color; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPercentage(int percentage) { this.percentage = percentage; }
    public void setPrice(float price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
}
