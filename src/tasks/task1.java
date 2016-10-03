package tasks;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Михаил on 13.09.2016.
 */
public class task1 {

    public static ArrayList<Long> list = new ArrayList<Long>();

    public static void main(String[] args) {

        long min=1, max=12666;

        for (long i = min; i <= max; i++) {

            BigInteger a = BigInteger.valueOf(i);
            BigInteger b = mirrorNum(a);
            BigInteger t=BigInteger.valueOf(0);

            for (int j = 0; j < 50; j++) {
                t = a.add(b);
                if (isPalindrom(t))
                {
                    System.out.println(""+j+". Палиндром "+a+"+"+b+"="+t);
                    break;
                }
                else {
                    System.out.println(""+j+". Не палиндром"+t);
                    a=t;
                    b=mirrorNum(t);
                }
            }
            System.out.println(t);
            if (!isPalindrom(t)) list.add(i);
        }


        printList(list);
        System.out.println(list.size());
    }

    public static BigInteger mirrorNum(BigInteger num)
    {
        String number = num.toString();
        char[] array = number.toCharArray();

        String mirroredNum="";

        for (int i = array.length-1; i >=0 ; i--) {
            mirroredNum=mirroredNum+Character.toString(array[i]);
        }

        BigInteger mirroredNumber = new BigInteger(mirroredNum);
        return mirroredNumber;
    }


    public static void printList(ArrayList<Long> list)
    {
        System.out.println(list);
    }

    public static boolean isPalindrom(BigInteger num)
    {
        String number = num.toString();
        char[] array = number.toCharArray();

        int counter = array.length/2;
        boolean truuu=false;

        for (int i = 0; i < counter; i++) {
            if (array[i]==array[array.length-1-i])
            {
                truuu=true;
            }
            else {
                truuu=false;
                return false;
            }
        }
        return true;
    }
}
