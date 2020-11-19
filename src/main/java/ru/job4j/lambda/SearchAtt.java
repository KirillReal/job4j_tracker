package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filter(Predicate<Attachment> attachmentPredicate,List<Attachment> attachmentList){
        List<Attachment> conditionRsllist = new ArrayList<>();
        for (Attachment el: attachmentList) {
            if(attachmentPredicate.test(el)){
                conditionRsllist.add(el);
            }
        }
        return conditionRsllist;
    }
    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> p = attachment -> attachment.getSize() < 100;
        return filter(p,list);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> p = attachment -> attachment.getName().contains("bug");
        return filter(p,list);
    }

    public static void main(String[] args) {
        Attachment att = new Attachment("Get", 10);
        Attachment att2 = new Attachment("bug", 24);
        Attachment att3 = new Attachment("Set", 120);
        List<Attachment> list = new ArrayList<>();
        list.add(att);
        list.add(att2);
        list.add(att3);
        System.out.println(filterName(list));
    }
}
