package OOP.objects;


public class Cat {
     private int age;  // Свойства объекта
     private String poroda;
     private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() { // Метод ( То, что умеет делать объект )

    System.out.println("Мяу!");

    }
    @Override
    public String toString() {
        return "Cat[Имя: "+ name +" Порода - " + poroda + " Ему целых " + age + " года ]";  // то, что вернет класс при обращении к нему
    }
}
