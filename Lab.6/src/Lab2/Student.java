package Lab2;


public class Student extends Human {

    private String patronymic;
    private double mark;

    public Student()
    {
        super();
        this.patronymic = "";
        this.mark = 0;
    }

    public Student(String name, int age, String sex, String Patronymic, double mark)
    {
        super(name, age, sex);
        this.patronymic = Patronymic;
        this.mark = mark;
    }

    public String GetPatronymic() {return patronymic;}
    public double GetMark() {return mark;}

    public void SetPatronymic(String patronymic) {this.patronymic = patronymic;}
    public void SetMark(double mark) {this.mark = mark;}


    public String toString()
    {
        return super.toString() + "\t" + patronymic + "\t" + mark;
    }

    public Parent CreatePair (Student stud)
    {
        Parent parent = new Parent(stud.GetPatronymic(), stud.GetAge() + 25, "man");
        return parent;
    }
}
