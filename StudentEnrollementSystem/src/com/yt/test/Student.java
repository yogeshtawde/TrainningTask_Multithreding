package com.yt.test;

public class Student
{
    private Integer studentId;
    private String studentName;
    private String email;
    private Long mobile;
    private String courseName;


    public Student(Integer studentId, String studentName, String email, Long mobile, String courseName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.mobile = mobile;
        this.courseName = courseName;
    }

    public Integer getStudentId()
    {
        return studentId;
    }

    public void setStudentId(Integer studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Long getMobile()
    {
        return mobile;
    }

    public void setMobile(Long mobile)
    {
        this.mobile = mobile;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
