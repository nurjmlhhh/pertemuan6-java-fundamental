package models;

public abstract class Character {
    public String nama;
    // Metode abstrak yang akan diimplementasikan oleh kelas anak
    public abstract void attack();

    // Metode biasa
    public void survive() {
        System.out.println("Method bertahan.");
    }

    public Character(String nama){
        this.nama = nama;
    }
}