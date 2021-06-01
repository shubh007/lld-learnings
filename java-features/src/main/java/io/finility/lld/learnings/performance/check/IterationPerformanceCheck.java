package io.finility.lld.learnings.performance.check;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationPerformanceCheck {

    private static String[] createArray(){
        String[] stringArray = new String[10_000_000];

        for(int i = 0; i < stringArray.length; i++){
            stringArray[i] = "Array" + i;
        }
        return stringArray;
    }
    public void checkPerformance() {
        List<String> testList = List.of(createArray());

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testList.size(); i++) {
            String temp = testList.get(i);
        }
        System.out.println("for loop totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        String str;
        for (Iterator<String> iterator = testList.iterator(); iterator.hasNext(); str = iterator.next()) {
        }
        System.out.println("iterator totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (ListIterator<String> iterator = testList.listIterator(); iterator.hasNext(); str = iterator.next()) {
        }
        System.out.println("ListIterator totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (String str1 : testList) {
        }
        System.out.println("Enhanced for loop totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testList.forEach(s -> {});
        System.out.println("for each totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testList.stream().forEach(s->{});
        System.out.println("stream for each totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testList.stream().iterator().forEachRemaining(s->{});
        System.out.println("stream iterator totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testList.parallelStream().forEach(s->{});
        System.out.println("parallelStream for each totalTime= " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testList.parallelStream().iterator().forEachRemaining(s->{});
        System.out.println("parallelStream iterator totalTime= " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
