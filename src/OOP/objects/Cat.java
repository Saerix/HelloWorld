package OOP.objects;


public class Cat {
    int age;  // Свойства объекта
     String poroda;
     String name;
void say() { // Метод ( То, что умеет делать объект )

    System.out.println("Мяу!");

    }
    @Override
    public String toString() {
        return "Cat[Имя: "+ name +" Порода - " + poroda + " Ему целых " + age + " года ]";  // то, что вернет класс при обращении к нему
    }
}
