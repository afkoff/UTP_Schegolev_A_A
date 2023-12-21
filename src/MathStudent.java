public class MathStudent extends Student
{
    public MathStudent(String fio)
    {
        super(fio);
    }

    @Override
    public void writeExam(int course)
    {
        System.out.println("Студент факультета ФН " + course + " курса пишет экзамен.");
    }
}
