package com.wingchun.system.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wingchun.base.controller.BaseController;

/**
 * 类描述TODO :  登录验证过滤器
 *   
 * @version 1.0 
 * @author 1518300818@qq.com  温柔一刀
 * 
 * <p>创建时间</p> : 2016-12-4 下午3:43:03
 * <p>修改历史</p> :
 *<pre>
 * 修改人                                                                                     修改时间                                                                              修改内容
 * ---------------------------        -------------------         -----------------------------------
 * 1518300818@qq.com  温柔一刀                              2016-12-4 下午3:43:03
 *</pre>
 */
public class LoginFilter extends BaseController implements Filter {

	/**
	 * 初始化
	 */
	public void init(FilterConfig fc) throws ServletException {
		//FileUtil.createDir("d:/FH/topic/");
	}
	
	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		chain.doFilter(req, res); // 调用下一过滤器
	}

}
