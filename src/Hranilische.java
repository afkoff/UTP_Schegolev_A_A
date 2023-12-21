import java.util.Objects;

public class Hranilische
{
    private int i = 1000;
    private int average_length;
    private int count = 0;
    private int tmp;
    private String[] array;
    public Hranilische()
    {
        array = new String[i];
    }

    public void add(String a) {
        if(array[i-2] != null){
            String[] array2 = new String[i];
            System.arraycopy(array, 0, array2, 0, i-2);
            i *= 2;
            String[] array = new String[i];
            System.arraycopy(array2, 0, array, 0, i-2);
        }
        count += 1;

        if(count == 1)
        {
            array[0] = a;
        }
        else
        {
            for (int j = 0; j < count; j++) {
                if (array[j] == null || (array[j].length() > a.length())) {
                    tmp = j;
                    break;
                }
            }
            if(array[tmp] != null)
            {
                for(int j = count-1; j >= tmp; j--)
                {
                    array[j+1] = array[j];
                }
            }

            array[tmp] = a;
        }
    }

    public void checkArray()
    {
        for(int j = 0; j < count; j++)
        {
            System.out.println(array[j]);
        }
    }

    public void maxElement()
    {
        System.out.println("Максимальный элемент(по длине): " + array[count-1]);
    }

    public void averageLength()
    {
        if(count == 0)
        {
            System.out.println("Средняя длина элементов = 0");
        }
        else
        {
            double count1 = 0;
            for(int j = 0; j < count; j++)
            {
                count1 += array[j].length();
            }
            System.out.println("Средняя длина элементов = " + count1/count);
        }
    }


}
