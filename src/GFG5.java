import java.util.Iterator;
import java.util.stream.Stream;

public class GFG5 {

    private static <T> void getStream(T[] arr){

        Stream<T> streamOfArray =
                Stream.of(arr);

        Iterator<T> it = streamOfArray.iterator();



    }
}
