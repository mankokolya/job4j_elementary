package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> attachments) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        return filter(attachments,func);
    }

    public static List<Attachment> filterName(List<Attachment> attachments) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        return filter(attachments,func);
    }

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predict) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment attachment : list) {
            if (predict.test(attachment)) {
                rsl.add(attachment);
            }
        }
        return rsl;
    }
}
