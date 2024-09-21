package models;

public class Crocodile implements Animal, Attack{ 
    @Override 
    public String eat() { 
        return "Buaya darat makan ayam bakar"; 
    } 
    @Override 
    public String sleep() { 
        return "Buaya darat tidur di asrama"; 
    }  

    @Override
    public String attack(){
        return null;
    }
 } 
