package com.yt.test;

public class CRMUpdateTask implements Runnable
{

    private Student student;

    public CRMUpdateTask(Student student)
    {
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
        System.out.println(Thread.currentThread().getName()+"Updating CRM for "+student.getStudentName());

        try
        {
            Thread.sleep(2500);

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"CRM Updated Successfull !");
    }
}
