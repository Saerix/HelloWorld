package OOP.objects;

public class mainObj {

    static Cat cat = new Cat(); //Создаем новый объект "cat"
    static People people = new People();

public static void main(String[] args){

    cat.setName("Джон"); // Присваиваем коту и человеку свойства
    cat.setPoroda("Сиамский");
    cat.setAge(3);
    people.setAge(3);
    people.setLastName("Morhun");
    people.setName("Stas");
    people.setCat(cat); // Присваиваем объекту человек, объект кот

    System.out.println(people);
    people.getCat().say(); // обращаемся к объекту cat и вызываем его метод say

}
}
