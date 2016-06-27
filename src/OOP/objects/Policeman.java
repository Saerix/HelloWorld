package OOP.objects;

public class Policeman extends People {   //extends People = наследуем класс People
private String typeProfession;

    public String getTypeProfession() {
        return typeProfession;
    }

    public void setTypeProfession(String typeProfession) {
        this.typeProfession = typeProfession;
    }

    public Policeman(String name, String lastName, int age, Cat cat, String typeProfession ) {  //Добавляем конструктор так как в классе People он тоже есть
        super(name, lastName, age, cat);

    }

    @Override
    public String toString() {
        return "Персона: [Имя: " + getName() + " Фамилия: " + getLastName() + " Возраст: " + getAge() + " Профессия: " + getTypeProfession() +  " ]";
    }
}
