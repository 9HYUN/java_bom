package com.company.design.proxy;

public class ProxyTest
{
   public static void main(String[] args)
   {
    // 요청 할때마다 loading
       Browser browser = new Browser("www.naver.com");
       browser.show();
       browser.show();
       browser.show();

   // 처음 요청만 loading 나머지 cache
       IBrowser ibrowser = new BrowserProxy("www.naver.com");
       ibrowser.show();
       ibrowser.show();

   }

}
