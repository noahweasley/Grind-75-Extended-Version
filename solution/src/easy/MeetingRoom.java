package easy;

import util.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {

    public static void main(String[] args) {
        Interval[] intervals = {new Interval(0, 30), new Interval(2, 6)};
        Interval[] intervals2 = {new Interval(10, 12), new Interval(2, 6)};
        System.out.println(canAttendMeetings(intervals));
        System.out.println(canAttendMeetings(intervals2));
    }

    private static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.start));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }

        return true;
    }
}
