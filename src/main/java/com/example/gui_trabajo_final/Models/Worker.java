package com.example.gui_trabajo_final.Models;

public class Worker {
    /*
    private enum Role { CEO, Finanzas, Logística, Marketing, Oficinista }
    */
    private int dni;
    private String name;
    private String surname;
    private String role;
    private float salary;

    // Constructor
    public Worker(int dni, String name, String surname, float salary, String role) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.role = role;
    }

    // Getters
    public int getDni() { return dni; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public float getSalary(){ return salary; }
    public String getRole() { return role; }

    // Setters
    public void setDni(int dni) { this.dni = dni; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setSalary(float salary) { this.salary = salary; }
    public void setRole(String role) { this.role = role; }

}