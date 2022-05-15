
    import java.util.*;
import java.util.stream.Stream;

    class GFG2 {


        private static <T> void getStream(List<T> list)
        {


            Stream<T> stream = list.stream();


            Iterator<T> it = stream.iterator();


            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }

        public static void main(String[] args)
        {


            List<String> list = new ArrayList<>();


            list.add("Geeks");
            list.add("for");
            list.add("Geeks");


            getStream(list);
        }
    }

