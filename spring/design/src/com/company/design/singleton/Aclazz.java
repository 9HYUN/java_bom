package com.company.design.singleton;

public class Aclazz
{
    private SocketClient socketClient;

    public Aclazz()
    {
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient(); 새로 객체를 만듬
    }

    public SocketClient getSocketClient()
    {
        return socketClient;
    }
}
