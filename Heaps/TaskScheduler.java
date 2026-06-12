package Heaps;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n){

        int[] frequency = new int[26];    // Count Frequencies
        for(char task : tasks){
            frequency[task - 'A']++;
        }

        int maxFrequency = 0;    // Find Maximum Frequnecy
        for(int f : frequency){
            maxFrequency = Math.max(maxFrequency, f);
        }

        int maxCount = 0;     // Find Maximum Count
        for(int f : frequency){
            if (f == maxFrequency) {
                maxCount++;
            }
        }

       int interval = (maxFrequency - 1) * (n + 1) + maxCount;

       return Math.max(tasks.length, interval);
    }
}
