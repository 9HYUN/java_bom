package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;
import org.w3c.dom.ls.LSOutput;

public class Main
{
    public static void main(String[] args)
    {
     /*   Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));*/
        HairDryer hairDryer =new HairDryer();
        connect(hairDryer);

        Cleaner cleaner =new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);


    /*    Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
    */
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();

    }
    //콘센트
    public static void connect(Electronic110v electronic110v)
    {
        electronic110v.powerOn();
    }

    IBrowser aopBrowser = new AopBrowser("www.naver.com",
            ()->{
                System.out.println("before");
                start.set(System.currentTimeMillis());
            },
            ()->{
                long now = System.currentTimeMillis();
                end.set(now - start.get());
            }
    );
    aopBrowser.show();
    System.out.println("loading time: " + end.get());
}
