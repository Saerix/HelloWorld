package OOP.objects;

public class People {

    static String name;
    static String lastName;
    static int age;

    private Cat cat;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        People.name = name;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        People.lastName = lastName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        People.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People[Имя: " + name + " Фамилия: " + lastName + " Возраст: " + age + " Есть кот: " + cat +  " ]";
    }
}
