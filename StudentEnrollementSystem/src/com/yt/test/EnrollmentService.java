package com.yt.test;

public class EnrollmentService
{


    public void  saveEnrollment(Student student)
    {
        System.out.println("Student Id: "+student.getStudentId());
        System.out.println("Student Name: "+student.getStudentName());
        System.out.println("Student Email: "+student.getEmail());
        System.out.println("Student mobile: "+student.getMobile());
        System.out.println("Couse Name: "+student.getCourseName());


        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Enrollment Saved Successfully");

    }



}
