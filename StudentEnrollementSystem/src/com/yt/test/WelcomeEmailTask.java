package com.yt.test;

public class WelcomeEmailTask implements Runnable
{
    private Student student;


    public WelcomeEmailTask(Student student)
    {
        this.student = student;
    }


    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @Override
    public void run()
    {

        System.out.println(Thread.currentThread().getName()+" sending mail to: "+student.getEmail());

        try
        {
            Thread.sleep(2500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Mail sent successfully!");
    }
}
