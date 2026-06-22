package com.yt.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StudentEnrollmentApplication
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Student student  = new Student(101,"Yogesh","yogeshtawde9@gmail.com",8010332050L,"Java Fullstack");
        EnrollmentService service = new EnrollmentService();
        service.saveEnrollment(student);


        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(new WelcomeEmailTask(student));
        executor.submit(new WelcomeEmailTask(student));
        executor.submit(new CRMUpdateTask(student));


        Future<String> invoiceFuture = executor.submit(new InvoiceTask(student));
        String invoiceNumber = invoiceFuture.get();
        System.out.println();
        System.out.println("Generated Invoice Number : " + invoiceNumber);

        executor.shutdown();

        System.out.println();
        System.out.println("All Enrollment Activities Completed");
    }
}
