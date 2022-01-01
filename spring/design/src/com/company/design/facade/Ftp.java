package com.company.design.facade;

public class Ftp
{
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path)
    {
        this.port = port;
        this.path = path;
        this.host = host;
    }

    public void connect()
    {
        System.out.println("FTP Host: " + host + "Port:"+ port + "로 연결합니다.");
    }

    public void moveDirectory()
    {
        System.out.println("FTP Path: " + path + "로 이동 합니다.");
    }

    public void disconnect()
    {
        System.out.println("FTP 연결을 종료 합니다.");
    }

}
