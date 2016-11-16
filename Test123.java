/**
 * Created by 89294 on 2016/11/2.
 */
import java.util.List;
import java.util.ArrayList;
public class Test123 {
    public static void main(String args []){
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");

        int a =strings.size();
        for(int i = 0;i<a;i++){
            String s = strings.get(i);
            System.out.println(s);
        }
    }
}
