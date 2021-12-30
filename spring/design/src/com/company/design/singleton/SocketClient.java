package com.company.design.singleton;

public class SocketClient
{
    private static SocketClient socketClient = null;

    private SocketClient(){}
    // public SocketClient(){} public으로 선언시 다른 class에서 새로 만들어 객체가 동일하지 않음
    public static SocketClient getInstance()
    {
        if(socketClient == null){
            socketClient = new SocketClient();
        }

        return socketClient;
    }

    public void connect()
    {
        System.out.println("connect");
    }
}
