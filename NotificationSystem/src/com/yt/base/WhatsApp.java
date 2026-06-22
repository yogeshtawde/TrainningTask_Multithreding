package com.yt.base;

public class WhatsApp implements Runnable
{
    private Customer customer;


    public WhatsApp(Customer customer)
    {
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
                        + " -> Sending WhatsApp Message to "
                        + customer.getCustomerName());

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Message : " + message);


    }
}
