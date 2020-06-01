package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class JobTest {
    private Comparator<Job> comparator;
    private Job job1 = new Job("Impl task", 0);
    private Job job2 = new Job("Fix bug", 1);
    private Job job3 = new Job("Fix bug", 0);

    @Test
    public void whenComparatorAscendByName() {
        comparator = new JobAscendByName();
        int rsl = comparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertTrue(rsl > 0);
    }

    @Test
    public void whenComparatorDescendByName() {
        comparator = new JobDescByName();
        int rsl = comparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertTrue(rsl < 0);
    }

    @Test
    public void whenComparatorAscendByPriority() {
        comparator = new JobAscendByPriority();
        int rsl = comparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertTrue(rsl < 0);
    }

    @Test
    public void whenComparatorDescendByPriority() {
        comparator = new JobDescByPriority();
        int rsl = comparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertTrue(rsl > 0);
    }

    @Test
    public void whenAscendComparatorByNameAndPriority() {
        comparator = new JobAscendByName().thenComparing(new JobAscendByPriority());
        List<Job> jobs = Arrays.asList(job1, job3, job2);
        Collections.sort(jobs, comparator);
        List<Job> jobsExpected = Arrays.asList(job3, job2, job1);
        assertEquals(jobsExpected, jobs);
    }

    @Test
    public void whenDescComparatorByNameAndPriority() {
       comparator = new JobDescByName().thenComparing(new JobDescByPriority());
        List<Job> jobs = Arrays.asList(job1, job3, job2);
        Collections.sort(jobs, comparator);
        List<Job> jobsExpected = Arrays.asList(job1, job2, job3);
        assertEquals(jobsExpected, jobs);
    }

    @Test
    public void whenAscendComparatorByPriorityAndName() {
        comparator = new JobAscendByPriority().thenComparing(new JobAscendByName());
        List<Job> jobs = Arrays.asList(job1, job3, job2);
        Collections.sort(jobs, comparator);
        List<Job> jobsExpected = Arrays.asList(job3, job1, job2);
        assertEquals(jobsExpected, jobs);
    }

    @Test
    public void whenDescComparatorByPriorityAndName() {
        comparator = new JobDescByPriority().thenComparing(new JobDescByName());
        List<Job> jobs = Arrays.asList(job1, job3, job2);
        Collections.sort(jobs, comparator);
        List<Job> jobsExpected = Arrays.asList(job2, job1, job3);
        assertEquals(jobsExpected, jobs);
    }
}