package com.lessons.multithread.executerservice;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class DemoExecutorServiceFuture {

    public static void main(String[] args) {

        try {
            createAndExtractSwfs();
        } catch (ExecutionException e) {
           e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void createAndExtractSwfs() throws ExecutionException, InterruptedException {

        System.out.println("Debut extraction ....");
        final Map<Long, List<Mail>> mailByMassifKey = getLongListMap();


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Collection<Future<?>> futures = new LinkedList<>();

        for (Map.Entry<Long, List<Mail>> mpEntry : mailByMassifKey.entrySet()) {
            futures.add(executorService.submit( () -> {
                System.out.println(Thread.currentThread().getName());
                return mpEntry.getValue()
                        .stream()
                        .map(Mail::getNbPages)
                        .collect(Collectors.toList());
                }
            ));

        }

        for (Future<?> future:futures) {
            var list = future.get();  //// This blocks until the task is complete
            System.out.println(list);  //[25, 26]   and [27, 28, 29]
        }

        System.out.println("Fin extraction ....");

    }

    private static Map<Long, List<Mail>> getLongListMap() {
        final Map<Long, List<Mail>> mailByMassifKey = new HashMap<>();
        Mail mail1 = new Mail(1L, 25);
        Mail mail2 = new Mail(2L, 26);
        List<Mail> list1 = new ArrayList<>();
        list1.add(mail1);
        list1.add(mail2);
        Mail mail3 = new Mail(3L, 27);
        Mail mail4 = new Mail(4L, 28);
        Mail mail5 = new Mail(5L, 29);
        List<Mail> list2= new ArrayList<>();
        list2.add(mail3);
        list2.add(mail4);
        list2.add(mail5);

        mailByMassifKey.put(1l, list1);
        mailByMassifKey.put(2l, list2);
        return mailByMassifKey;
    }

}
