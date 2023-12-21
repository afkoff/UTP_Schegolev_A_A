public abstract class Student
{
    private final String fio;
    private int course;
    private int mark;

    public Student(String fio)
    {
        this.fio = fio;
    }

    public void setCourse(int course)
    {
        if(course > 0 && course < 7)
        {
            this.course = course;
        }
        else
        {
            throw new RuntimeException("Course invalid.");
        }
    }

    public void setMark(int mark)
    {
        if(mark > 0 && mark < 6)
        {
            this.mark = mark;
        }
        else
        {
            throw new RuntimeException("Mark invalid.");
        }
    }
    public abstract void writeExam(int course);
}
