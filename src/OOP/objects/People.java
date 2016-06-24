package OOP.objects;

public class People {

    static String name;
    static String lastName;
    static int age;

    Cat cat;

    @Override
    public String toString() {
        return "People[Имя: " + name + " Фамилия: " + lastName + " Возраст: " + age + " Есть кот: " + cat +  " ]";
    }
}
