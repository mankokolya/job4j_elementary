package ru.job4j.collection;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 1),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscendByName().thenComparing(new JobAscendByPriority()));
        System.out.println(jobs);
        System.out.println(jobs);
    }
}
