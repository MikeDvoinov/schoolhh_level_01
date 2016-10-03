package tasks;

/**
 * Created by Михаил on 12.09.2016.
 */
public class task2 {

    public static int endOfNum=0;

    public static void main(String[] args) {

        int num=0;
        int counter=0;

        boolean ten = true;
        int start=1;
        int LAST=5500000;

        for (num = start; num <= LAST; num++) {

            String numString = Integer.toString(num);
            if (numString.contains("5")){

                //System.out.println("В "+ numString+" Есть 5");

                char[] array = numString.toCharArray();
                int[] mas = masCreator(array);

                for (int i = 0; i < mas.length; i++) {
                    endOfNum=0;
                    ten=tenCounter(mas,i);
                    if (endOfNum==128) break;
                }
                if (ten && endOfNum==128)
                {
                    System.out.println(numString);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static int[] masCreator(char[] array)
    {
        int[] mas = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int a = Character.getNumericValue( array[i]);
            mas[i]=a;
        }
        return mas;
    }

    public static boolean tenCounter(int[] mas, int i)
    {
        int ten=0;

        for (int j = i; j < mas.length; j++) {
            ten=ten+mas[j];
            if (j==mas.length-1) endOfNum=128;
            if (ten==10)
            {
                return true;
            }
        }
        return  false;
    }
}
