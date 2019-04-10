package cdl.wh.warehousecustomer.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class CORSFilter implements Filter
{
  private static final Logger LOG = LoggerFactory.getLogger(CORSFilter.class);
  private String mode = "DENY";

  /**
   * Add X-FRAME-OPTIONS response header to tell IE8 (and any other browsers who
   * decide to implement) not to display this content in a frame. For details, please
   * refer to http://blogs.msdn.com/sdl/archive/2009/02/05/clickjacking-defense-in-ie8.aspx.
   */
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
  
	LOG.info("***********************************************************************************"); 
	LOG.info("***********************************************************************************"); 
	LOG.info("***********************************************************************************"); 
    HttpServletResponse res = (HttpServletResponse)response;
    HttpServletRequest req = (HttpServletRequest) request;
    res.addHeader("Access-Control-Allow-Origin", "*");
    if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
    	res.setHeader("Access-Control-Allow-Methods", "POST,GET,DELETE");
    	res.setHeader("Access-Control-Max-Age", "3600");
    	res.setHeader("Access-Control-Allow-Headers", "content-type,access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with");
    	res.setStatus(HttpServletResponse.SC_OK);
    } else {
        chain.doFilter(req, res);
    }
    
    res.setHeader("Access-Control-Allow-Origin", "*");
    res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    res.setHeader("Access-Control-Max-Age", "3600");
    res.setHeader("Access-Control-Allow-Headers", "content-type,access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with,x-xsrf-token");

    if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
    	res.setStatus(HttpServletResponse.SC_OK);
    } else {
        chain.doFilter(req, res);
    }
    
 
    
  }

  public void destroy() {
  }

  public void init(FilterConfig filterConfig) {
    String configMode = filterConfig.getInitParameter("mode");
    if ( configMode != null ) {
      mode = configMode;
    }
  }

}
