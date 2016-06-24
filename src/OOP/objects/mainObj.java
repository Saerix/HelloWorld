package OOP.objects;

public class mainObj {

    static Cat cat = new Cat(); //Создаем новый объект "cat"
    static People people = new People();

public static void main(String[] args){

cat.name = "Джон"; // Присваиваем коту и человеку свойства
    cat.poroda = "Сиамский";
    cat.age = 3;
    people.name = "Stas";
    people.lastName = "Morhun";
    people.age = 26;
    people.cat = cat; // Присваиваем объекту человек, объект кот

    System.out.println(people);
    cat.say(); // обращаемся к объекту cat и вызываем его метод say

}
}
