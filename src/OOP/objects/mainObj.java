package OOP.objects;

import impl.BusDriver;
import impl.Transport;

public class mainObj {

    private static Cat cat; //Создаем новый объект "cat"
    private static People people;

public static void main(String[] args){

    cat = new Cat(2,"Персидский","Джон"); //Обращаемся к конструктору
    people = new People("Stas", "Morhun", 33, cat);
    // people.setCat(cat);  Присваиваем объекту человек, объект кот

    System.out.println(people);
    people.getCat().say(); // обращаемся к объекту cat и вызываем его метод say
    Policeman policeman = new Policeman ("Sergey", "Kobec" , 26 , cat, "Default");
    policeman.setTypeProfession("Policeman");
    System.out.println(policeman);
    cat.sleep();
    BusDriver t = new BusDriver();
    System.out.println(t.getSpeed());
    t.setCategory("D");
    t.go();
}

}
