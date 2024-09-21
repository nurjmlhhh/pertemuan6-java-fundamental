package models;

public class Result { 
    // Method pertama dengan 1 parameter bertipe int 
    void printData(int nim){ 
        System.out.println("NIM : " + nim); 
    } 
    // Method kedua dengan 2 parameter bertipe int dan string 
    void printData( int nim, String name){ 
        System.out.println("NIM : " + nim); 
        System.out.println("Nama  : " + name); 
    } 
    // Method ketiga dengan 3 parameter bertipe int, string dan string 
    void printData(int nim, String name, String major){ 
        System.out.println("NIM : " + nim); 
        System.out.println("Nama  : " + name); 
        System.out.println("Prodi : " + major); 
    } 
    public static void main(String[] args) { 
        Result result = new Result(); 
        result.printData(123456789); 
        result.printData(123456789, "Aisyah Romaito Siregar"); 
        result.printData(123456789, "Aisyah Romaito Siregar", 
                         "D3 Manajemen Informatika"); 
    } 
 } 
