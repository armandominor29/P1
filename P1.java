/**
 * Created by armandominor on 11/3/15.
 */
//Program takes a string and separates it using the split method
//splits by set delimiter and also includes

import java.util.Arrays;

public class P1
{
    public static void main(String[] args)
    {
        String s = "ab#12#453"; //string to be used
        String s2 ="a?b?gf#e";      //string 2 to be used

        //splits regular expression by special character and
        //prints each string character set by delimiter and also includes delimiter

        System.out.println(Arrays.toString(s.split("((?<=#)|(?=#))")));

        System.out.println(Arrays.toString(s2.split("((?<=[?#])|(?=[?#]))")));
    }
}
