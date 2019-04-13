package org.katheer.bean;

public class Course {
    private String cid;
    private String cname;
    private int ccost;

    public Course(String cid, String cname, int ccost) {
        System.out.println("3-arg constructor");
        this.cid = cid;
        this.cname = cname;
        this.ccost = ccost;
    }

    public Course(String cid, String cname) {
        System.out.println("2-arg constructor");
        this.cid = cid;
        this.cname = cname;
    }

    public Course(String cid) {
        System.out.println("1-arg constructor");
        this.cid = cid;
    }

    public Course() {
        System.out.println("0-arg constructor");
    }

    public void getCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("---------------");
        System.out.println("Course Name : " + this.cname);
        System.out.println("Course ID   : " + this.cid);
        System.out.println("Course Cost : " + this.ccost);
        System.out.println();
    }
}
