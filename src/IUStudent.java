public class IUStudent extends Student
{
    public IUStudent(String fio)
    {
        super(fio);
    }

    @Override
    public void writeExam(int course)
    {
        System.out.println("Студент факультета ИУ " + course + " курса пишет экзамен.");
    }
}
