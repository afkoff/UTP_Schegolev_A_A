public class Main
{
    public static void main(String[] args)
    {
        IUStudent student1 = new IUStudent("Alex");
        MathStudent student2 = new MathStudent("Artem");
        student1.writeExam(1);
        student2.writeExam(2);


        Hranilische array1 = new Hranilische();

        array1.add("123");
        array1.add("1234");
        array1.add("1");
        array1.add("12");
        array1.checkArray();
        array1.averageLength();
        array1.maxElement();


    }
}