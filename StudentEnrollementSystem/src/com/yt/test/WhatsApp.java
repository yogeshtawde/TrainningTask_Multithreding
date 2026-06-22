package com.yt.test;

public class WhatsApp implements Runnable
{

    private Student student;


    public WhatsApp(Student student) {
        this.student = student;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" Sending WhatsApp Message to "+student.getMobile());

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"WhatsApp message sent!");
    }
}
