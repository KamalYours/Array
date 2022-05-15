import java.util.Iterator;
import java.util.stream.Stream;

public class GFG6 {

    private static void getStream(){

        Stream<String> streamOfArray =
                Stream.empty();

        Iterator<String> it =
                streamOfArray.iterator();

        while(it.hasNext()){
            System.out.println(it.hasNext()+" ");
        }
    }

    public static void main(String[] args) {
        getStream();
    }
}
