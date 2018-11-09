package beans;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloWorld extends ParameterizableViewController 

{
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res ) throws Exception {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name");
		Map map = new HashMap();
		map.put("msg","Hello..."+name);
		ModelAndView mav = new ModelAndView(getViewName(), map);
		return mav;
}
}
