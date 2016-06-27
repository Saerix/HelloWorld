package OOP.objects;

public class mainObj {

    private static Cat cat; //Создаем новый объект "cat"
    private static People people;

public static void main(String[] args){

    cat = new Cat(2,"Персидский","Джон"); //Обращаемся к конструктору
    people = new People("Stas", "Morhun", 3, cat);
    // people.setCat(cat);  Присваиваем объекту человек, объект кот

    System.out.println(people);
    people.getCat().say(); // обращаемся к объекту cat и вызываем его метод say

}
}
