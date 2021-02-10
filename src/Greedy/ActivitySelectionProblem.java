package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblem
{
    public static void main(String args[])
    {
        int starting[] = {5,1,3,0,5,8};
        int ending[] = {9,2,4,6,7,9};
        Activity[] activities = new Activity[starting.length];

        for(int i = 0; i < starting.length; i++)
        {
            activities[i]= new Activity(starting[i],ending[i]);
        }
        ActivityComparator activityComparator = new ActivityComparator();
        Arrays.sort(activities,activityComparator);
        System.out.println(activities[0].getStart()+","+activities[0].getEnd());
        int endTime = activities[0].getEnd();
        for(int i = 1; i < starting.length; i++)
        {
            if(endTime<=activities[i].getStart())
            {
                System.out.println(activities[i].getStart()+","+activities[i].getEnd());
                endTime = activities[i].getEnd();
            }
        }
    }
}

class Activity
{
    private int start;
    private int end;

    public Activity(int start,int end)
    {
        this.end = end;
        this.start = start;
    }

    public int getStart()
    {
        return this.start;
    }

    public int getEnd()
    {
        return this.end;
    }
}

class ActivityComparator implements Comparator<Activity>
{

    @Override
    public int compare(Activity o1, Activity o2)
    {
        return o1.getEnd() - o2.getEnd();
    }
}
