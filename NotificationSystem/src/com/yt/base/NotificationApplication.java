package com.yt.base;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationApplication
{
    public static void main(String[] args)
    {
        List<Customer> customers = List.of(

                new Customer(101, "Ravi", "ravi@gmail.com", 9876543210L),
                new Customer(102, "Yogesh", "yogesh@gmail.com", 9876543211l),
                new Customer(103, "Rahul", "rahul@gmail.com", 9876543212L),
                new Customer(104, "Amit", "amit@gmail.com", 9876543213l),
                new Customer(105, "Monika", "monika@gmail.com", 9876543214L)
        );

        ExecutorService executor =
                Executors.newFixedThreadPool(5);

        System.out.println("Big Billion Day Notification Started...\n");

        for (Customer customer : customers) {

            executor.submit(
                    new EmailNotification(customer));

            executor.submit(
                    new WhatsApp(customer));
        }

        executor.shutdown();

        System.out.println("\nAll Notification Tasks Submitted...");
    }
}
