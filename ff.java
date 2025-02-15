import java.util.*;

class MeetingScheduler {
    public static int maxMeetings(int[] start, int[] end) {
        int n = start.length, count = 1, lastEnd = 0;
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) meetings[i] = new int[]{end[i], start[i]};
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        lastEnd = meetings[0][0];
        for (int i = 1; i < n; i++) {
            if (meetings[i][1] > lastEnd) {
                count++;
                lastEnd = meetings[i][0];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5}, end = {2, 4, 6, 7, 9, 9};
        System.out.println("Maximum number of meetings: " + maxMeetings(start, end));
    }
}
