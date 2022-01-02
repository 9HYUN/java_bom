package com.company.design.adapter;

public class adapterTest
{
    private static String connect;

    public static void main(String[] args)
    {
        HairDryer hairDryer =new HairDryer();

        Cleaner cleaner =new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        adapter.powerOn();

        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airAdapter = new SocketAdapter(airConditioner);
        airAdapter.powerOn();

    }

        //콘센트
    public static void connect(Electronic110v electronic110v)
    {
        electronic110v.powerOn();
    }

}
