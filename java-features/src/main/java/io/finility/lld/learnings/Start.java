package io.finility.lld.learnings;

import io.finility.lld.learnings.performance.check.IterationPerformanceCheck;

public class Start {
    public String getGreeting() {
        return "Hello World3!";
    }

    public static void main(String[] args) {

        System.out.println(new Start().getGreeting());
        IterationPerformanceCheck iterationPerformanceCheck = new IterationPerformanceCheck();
        iterationPerformanceCheck.checkPerformance();
    }
}
