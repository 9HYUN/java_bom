package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.Audi;
import com.company.design.decorator.Icar;
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
        Icar audi = new Audi(1000);
        audi.showPrice();
    }

}
