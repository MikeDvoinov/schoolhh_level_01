package tasks;

/**
 * Created by Михаил on 12.09.2016.
 */
public class task3 {

    public static void main(String[] args) {

        int r=1,q=0,w=0,x=0,z=0;
        int counter=0;

        for (r = 1; r < 10; r++) {
            for (q = 0; q < 10 ; q++) {
                for (w = 0; w < 10; w++) {
                    for (x = 0; x < 10; x++) {
                        for (z = 0; z < 10; z++) {

                            if (r!=q && r!=w && r!=x && r!=z && q!=w && q!=x && q!=z && w!=x && w!=z && x!=z)
                            {
                                String str1= Integer.toString(r)+Integer.toString(q)+Integer.toString(r);
                                String str2= Integer.toString(r)+Integer.toString(w)+Integer.toString(z)+Integer.toString(w);
                                String str3= Integer.toString(r)+Integer.toString(x)+Integer.toString(z)+Integer.toString(x);

                                int A=Integer.parseInt(str1);
                                int B=Integer.parseInt(str2);
                                int C=Integer.parseInt(str3);

                                if (A+B==C) {
                                    counter++;
                                    System.out.println(A+"+"+B+"="+C);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
