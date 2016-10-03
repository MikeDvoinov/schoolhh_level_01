package tasks;

/**
 * Created by Михаил on 12.09.2016.
 */
public class task4 {

    public static void main(String[] args) {

        int i=1;
        boolean truuu=false;

        while (!truuu)
        {
            int x=4*i;
            int y=5*i;
            char t;

            String xString = Integer.toString(x);
            String yString = Integer.toString(y);

            if (xString.length()==yString.length())
            {
                char[] array = yString.toCharArray();

                System.out.println(xString + ", " + yString);
                int counter=0;
                for (int j = 0; j < xString.length(); j++) {
                    t = xString.charAt(j);
                    System.out.println(t);

                    for (int k = 0; k < array.length; k++) {
                        if (array[k]==t) {
                            counter++;
                            //System.out.println(array);
                            array[k]='z';
                            System.out.println(t);
                            //System.out.println(array);
                            break;
                        }
                    }

                }
                if (counter==xString.length()) {

                    System.out.println(i);
                    truuu=true;
                }
            }
            i++;


        }

    }
}
