package Algo;

import java.util.*;

class Job {
    int id, deadline, profit;

    Job(int id, int d, int p) {
        this.id = id;
        this.deadline = d;
        this.profit = p;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        Job[] jobs = {
            new Job(1, 2, 20),
            new Job(2, 2, 50),
            new Job(3, 1, 10),
            new Job(4, 3, 5),
            new Job(5, 3, 1)
        };

        int result = jobScheduling(jobs);

        System.out.println("\nMaximum Profit = " + result);
    }


    // Each job takes 1 unit time → only deadline matters
    static int jobScheduling(Job[] jobs) {

        // 1️ Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // 2️ Find max deadline → number of slots
        int maxDeadline = 0;
        for (Job j : jobs)
            maxDeadline = Math.max(maxDeadline, j.deadline);

        boolean[] slot = new boolean[maxDeadline + 1];

        int totalProfit = 0;

        System.out.println("Scheduled jobs:");

        // 3️ Try placing each job
        for (Job j : jobs) {

            // place in latest free slot
            for (int t = j.deadline; t >= 1; t--) {

                if (!slot[t]) {
                    slot[t] = true;
                    totalProfit += j.profit;

                    System.out.println("Job " + j.id + " at slot " + t +" profit " + j.profit);       
                    break;
                }
            }
        }

        return totalProfit;
    }
}
