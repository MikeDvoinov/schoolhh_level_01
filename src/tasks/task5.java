package tasks;

/**
 * Created by Михаил on 12.09.2016.
 */
public class task5 {


    public static void main(String[] args) {

        int step=2, div=step, sum=1, size=1143, steps= size/2+1, num=1;

        for(int i=1; i<steps; i++){
            for(int j=0; j<4; j++){
                num=num+div;
                sum=sum+num;
            }
            div=div+step;
            System.out.println(sum);
        }


    }


}
