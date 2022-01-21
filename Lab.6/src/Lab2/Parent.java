package Lab2;
import java.util.Scanner;

public class Parent extends Human {

    public Parent()
    {
        super();
    }

    public Parent(String name, int age, String sex)
    {
        super(name, age, sex);
    }

    public String toString()
    {
        return super.toString();
    }

    public Student CreatePair (Parent parent)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String name = sc.nextLine();
        System.out.println("Введите пол студента");
        String sex = sc.nextLine();

        System.out.println("Введите среднюю оценку студента");
        double mark = sc.nextDouble();

        Student stud = new Student(name, parent.GetAge() - 25, sex, parent.GetName(), mark);
        return stud;
    }
}
