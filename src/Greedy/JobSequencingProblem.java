package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem
{
    public static void main(String args[])
    {
        Job[] jobs = new Job[5];
        jobs[0]= new Job("1",2,100);
        jobs[1]= new Job("2",1,19);
        jobs[2]= new Job("3",2,27);
        jobs[3]= new Job("4",1,25);
        jobs[4]= new Job("5",3,15);
        JobSequencer jobSequencer = new JobSequencer();
        Arrays.sort(jobs,jobSequencer);

        System.out.println(jobs[0].getId());
        int deadlineProfit = jobs[0].getProfit();
        int time = jobs[0].getDeadline();
        for(int i = 1; i<jobs.length;i++)
        {
            if(time<=jobs[i].getDeadline())
            {
                deadlineProfit = deadlineProfit+jobs[i].getProfit();
                time = time + jobs[i].getDeadline();
                System.out.println(jobs[i].getId());
            }
        }

        System.out.println("Time : "+time +" TotalProfit : "+deadlineProfit);
    }
}

class Job
{
    private String id;
    private int deadline;
    private int profit;

    public Job(String id, int deadline,int profit)
    {
        this.deadline = deadline;
        this.id = id;
        this.profit = profit;
    }
    public String getId()
    {
        return id;
    }
    public int getDeadline()
    {
        return deadline;
    }
    public int getProfit()
    {
        return profit;
    }
}

class JobSequencer implements Comparator<Job>
{
    @Override
    public int compare(Job o1, Job o2)
    {
        return o2.getProfit() - o1.getProfit();
    }
}