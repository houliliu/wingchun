package com.wingchun.base.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
/**
 * 类描述TODO :  
 *   
 * @version 1.0 
 * @author 1518300818@qq.com  温柔一刀
 * 
 * <p>创建时间</p> : 2016-12-4 下午3:46:25
 * <p>修改历史</p> :
 *<pre>
 * 修改人                                                                                     修改时间                                                                              修改内容
 * ---------------------------        -------------------         -----------------------------------
 * 1518300818@qq.com  温柔一刀                              2016-12-4 下午3:46:25
 *</pre>
 */
public class MyExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		System.out.println("==============异常开始=============");
		ex.printStackTrace();
		System.out.println("==============异常结束=============");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex.toString().replaceAll("\n", "<br/>"));
		return mv;
	}

}
