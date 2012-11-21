package rentalapp.web;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import rentalapp.web.HelloController;

import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;


public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}