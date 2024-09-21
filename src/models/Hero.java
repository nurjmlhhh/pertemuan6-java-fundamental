package models;

public class Hero extends Character{
    @Override
    public void attack() {
        System.out.println("Pahlawan menyerang musuh !!!");
    }

    public Hero(String nama){
        super(nama);
    }
    
}
