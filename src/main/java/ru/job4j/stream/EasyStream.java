package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private ListIterator<Integer> stream;
    private List<Integer> list;
    public static EasyStream of(List<Integer> source) {
        return new Builder().
                listFuncIterator(source).
                listFunc().
                build();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        while (stream.hasNext())
        {
           list.add(fun.apply(stream.next()));
       }
        return EasyStream.of(list);
    }

    public EasyStream filter(Predicate<Integer> filter) {
        while(stream.hasNext()){
            Integer current = stream.next();
            if(filter.test(current)){
                list.add(current);
            }
        }
        return EasyStream.of(list);
    }

    public List<Integer> collect() {
        while(stream.hasNext()){
                list.add(stream.next());
            }
        return list;
    }


    public static class Builder{
        private final EasyStream easyStream;
        private Builder(){
            easyStream = new EasyStream();
        }
        public Builder listFunc(){
            easyStream.list = new ArrayList<>();
            return this;
        }
        public Builder listFuncIterator(List<Integer> source){
            easyStream.stream = source.listIterator();
            return this;
        }

        private EasyStream build(){
            return easyStream;
        }
    }
}
