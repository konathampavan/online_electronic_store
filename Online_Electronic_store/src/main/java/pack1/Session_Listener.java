package pack1;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class Session_Listener implements HttpSessionListener,HttpSessionAttributeListener
{
  @Override
public void sessionCreated(HttpSessionEvent se) 
  {
	System.out.println("session created");
}
  @Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session destroyed");
	}
  @Override
	public void attributeAdded(HttpSessionBindingEvent se) 
  {
	  System.out.println("attribute added to the session");
	  System.out.println("===>"+se.getName());
		
	}
  @Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("attribute removed from the session");
	}
}
