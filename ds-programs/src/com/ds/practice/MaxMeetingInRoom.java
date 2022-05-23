package com.ds.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMeetingInRoom {



    static int getMaxMeeting(Meeting[] meetings){

       List<Meeting> meeting= Arrays.stream(meetings).sorted(Comparator.comparing(Meeting::getEnd)).toList();

       int maxMeeting=1;
       int time=meeting.get(0).getEnd();
        System.out.println(meeting.get(0).start +" "+meeting.get(0).end);
       for(int i=1;i<meeting.size();i++){
           if(meeting.get(i).getStart()>=time){
               maxMeeting=maxMeeting+1;
               time=meeting.get(i).getEnd();
               System.out.println(meeting.get(i).start +" "+meeting.get(i).end);
           }
       }

       return maxMeeting;
    }

    public static void main(String args[]){

        Meeting[] meetingArr=new Meeting[5];
        meetingArr[0]=new Meeting(3,29);
        meetingArr[1]=new Meeting(50,93);
        meetingArr[2]=new Meeting(88,92);
        meetingArr[3]=new Meeting(54,67);
        meetingArr[4]=new Meeting(50,87);
        int maxMeeting=getMaxMeeting(meetingArr);
        System.out.println("Max Meeting "+maxMeeting);

    }
}

class Meeting {
    public int start;
    public int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
