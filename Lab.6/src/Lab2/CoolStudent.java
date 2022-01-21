package Lab2;

import java.util.Scanner;

public class CoolStudent extends Human {
    private String patronymic;
    private double mark;

    public CoolStudent()
    {
        super();
        this.patronymic = "";
        this.mark = 0;
    }

    public CoolStudent(String name, int age, String sex, String Patronymic, double mark)
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

    public CoolParent CreatePair (CoolStudent coolstud)
    {
        CoolParent coolparent = new CoolParent(coolstud.GetPatronymic(),
                coolstud.GetAge() + 25, "man", Math.pow(10, coolstud.GetMark()));
        return coolparent;
    }
}
