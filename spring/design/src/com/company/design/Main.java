package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.SftpClient;
import com.company.design.noFacade.Ftp;
import com.company.design.noFacade.Reader;
import com.company.design.noFacade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;
import org.w3c.dom.ls.LSOutput;

public class Main
{
    public static void main(String[] args)
    {
//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//        //a4
//        ICar audi4 = new A4(audi, "A4");
//        audi4.showPrice();
//        //a5
//        ICar audi5 = new A5(audi, "A5");
//        audi5.showPrice();
//
//        Button button = new Button("버튼");
//
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//
//        button.click("메세지 전달: click1");
//        button.click("메세지 전달: click2");
//        button.click("메세지 전달: click3");
//        button.click("메세지 전달: click4");
//
//        // noFacade
//
//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.fileWrite();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disconnect();
//
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"home/etc","text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disConnect();
//
//        Encoder encoder =new Encoder();
//
//        //Base64
//        EncodingStrategy base64 = new Base64Strategy();
//
//        //normal
//        EncodingStrategy normal = new NormalStrategy();
//
//        String message = "hello java";
//
//        encoder.setEncodingStrategy(base64);
//        String base64Result = encoder.getMessage(message);
//        System.out.println(base64Result);
//
//
//        encoder.setEncodingStrategy(normal);
//        String normalResult = encoder.getMessage(message);
//        System.out.println(normalResult);
//
//        encoder.setEncodingStrategy(new Appendstrategy());
//        String appendResult = encoder.getMessage(message);
//        System.out.println(appendResult);
    }




}
