
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class GFG3 {

    private static <T> void getStream(T[] arr){

        Stream<T> streamOfArray =
                Arrays.stream(arr);

        Iterator<T> it =
                streamOfArray.iterator();

        while (it.hasNext()){
            System.out.println(it.hasNext()+" ");
        }
    }

    public static void main(String[] args) {

        String[] arr = new String[]{ "a" , "b" , "c" , "d" };
        getStream(arr);

    }
}


