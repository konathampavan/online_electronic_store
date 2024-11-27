package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class Request_Listeners implements ServletRequestListener,ServletRequestAttributeListener
{
  
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
    	System.out.println("Request object initialized");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
    	System.out.println("Request object Destroyed");
    }
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
    	System.out.println("Attribute Added to requestv object");
    	System.out.println("====>"+srae.getName());
    }
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
    	System.out.println("Attribute removed to request object");
    }
}
