import models.Cat;
import models.Crocodile;
import models.Hero;

public class App {
    public static void main(String[] args) throws Exception {
        Hero hero = new Hero("arya");

        hero.attack();
        hero.survive();
        hero.nama = "Tisa";

         // Instansiasi objek dari class Cat dan Crocodile 
        Cat kucing = new Cat(); 
        Crocodile buaya = new Crocodile(); 
        // Memanggil method yang ada di setiap class 
        System.out.println(kucing.eat()); 
        System.out.println(kucing.sleep()); 
        System.out.println(buaya.eat()); 
        System.out.println(buaya.sleep());
        System.out.println(buaya.attack());
    }
}
