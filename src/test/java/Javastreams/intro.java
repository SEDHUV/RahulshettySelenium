package Javastreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class intro {

    // @Test
    public void sanple() {
        ArrayList<String> a = new ArrayList<>();
        a.add("arun");
        a.add("balaji");
        a.add("aru");
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            String letter = a.get(i);
            if (letter.startsWith("a"))

                count++;

        }
        System.out.println(count);
    }


    //@Test
    public void streamfilter() {
        ArrayList<String> a = new ArrayList<>();
        a.add("airun");
        a.add("balaji");
        a.add("aru");
        long filter = a.stream().filter(s->s.startsWith("a")).count();
        System.out.println(filter);
//another method
      long s =   Stream.of("arun","balaji","chandru").filter(k->
                {
                    return k.startsWith("a");

                }).count();
      System.out.println(s);

      a.stream().filter(r->r.length()>1).forEach(r->System.out.println(r));//filtering with condition
      a.stream().filter(r->r.length()>1).limit(1).forEach(r->System.out.println(r));//limiting the results


    }

   // @Test
    public void mapstream(){

        Stream.of("sedhu","haema").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        Stream.of("haema1","haema2","haema3").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        List<String> b =    Arrays.asList("haema1","haema2","haema3");
        ArrayList<String> a = new ArrayList<>();
        a.add("airun");
        a.add("balaji");
        a.add("aru");
        a.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        //concat and using match keyword
      Stream<String> filtered =   Stream.concat(b.stream(),a.stream());
     System.out.println(filtered.anyMatch(s->s.equalsIgnoreCase("balaji")));

    }
    @Test
    public void streamcollect(){

        List<String> col = Stream.of("sedhu","haema","mahima").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(col.get(1));
         Stream.of("sedhu","haema","mahima").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).limit(1).forEach(s->System.out.println(s));
//printing unique numbers
        List<Integer> values = Arrays.asList(1,3,2,3,4,5,5);
       // values.stream().distinct().forEach(s->System.out.println(s));
        //sorting and printing unique value
        List<Integer> stream = values.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(stream.get(2));
    }
}
