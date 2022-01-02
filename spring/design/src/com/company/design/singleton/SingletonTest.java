package com.company.design.singleton;

public class SingletonTest
{
    public static void main(String[] args)
    {
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        System.out.println("두 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

    }
}
