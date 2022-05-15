import java.util.Iterator;
import java.util.stream.Stream;

public class GFG7 {

    private static <T> void getStream(){

        Stream.Builder<String> builder=
                Stream.builder();

        Stream<String> stream =
                builder.add("a").add("b").add("c").add("d").build();

        Iterator<String> it = stream.iterator();

        while (it.hasNext()){
            System.out.println(it.hasNext()+"");
             break;
        }
    }

    public static void main(String[] args) {
        getStream();
    }
}
