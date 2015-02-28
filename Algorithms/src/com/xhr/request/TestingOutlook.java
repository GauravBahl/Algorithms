package com.xhr.request;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class TestingOutlook {

public static void main(String[] args)
{
	
	
	 
ActiveXComponent ol = new ActiveXComponent("Outlook.Application");
Dispatch dsp = new Dispatch();
Dispatch olo = ol.getObject();
Dispatch myNamespace = Dispatch.call(olo, "GetNamespace","MAPI").toDispatch();
Dispatch myFolder = Dispatch.call((Dispatch) myNamespace,"GetDefaultFolder", new Integer(6)).toDispatch();
Dispatch items = Dispatch.get(myFolder, "Items").toDispatch();
Dispatch mails = Dispatch.get(myFolder, "Items").toDispatch();

int count = Dispatch.call(mails, "Count").toInt();
System.out.println("Totl Msg Count"+count);
for (int i = 1; i <= count; i++)
{
Dispatch item;
item = Dispatch.call(items, "Item", new Integer(i)).toDispatch();
String msg = item.toString();




}
}
}
