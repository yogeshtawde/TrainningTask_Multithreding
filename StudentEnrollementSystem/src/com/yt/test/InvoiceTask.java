package com.yt.test;

import java.util.concurrent.Callable;

public class InvoiceTask implements Callable<String>
{

    private Student student;

    public InvoiceTask(Student student)
    {
        this.student = student;
    }

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    @Override
    public String call() throws Exception
    {
        System.out.println(Thread.currentThread().getName()+"Generating invoice for "+student.getStudentName());


            Thread.sleep(4000);
            String invoiceNumber = "INV-" + student.getStudentId();
            System.out.println(Thread.currentThread().getName() + " -> Invoice Generated");
        return invoiceNumber;
    }
}
