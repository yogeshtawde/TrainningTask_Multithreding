package com.yt.base;

public class EmailNotification implements Runnable
{

    private Customer customer;

    public EmailNotification(Customer customer) {
        this.customer = customer;
    }



    @Override
    public void run()
    {

        String message =
                "Dear " + customer.getCustomerName()
                        + ", Big Billion Day Sale is live now. "
                        + "Get up to 80% discount on mobiles, laptops, fashion, "
                        + "and electronics. Hurry up!";

        System.out.println(
                Thread.currentThread().getName()
                        + " -> Sending Email to "
                        + customer.getCustomerName());
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Message : " + message);

    }
}
