/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-09-04 13:01:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.List;
import com.hcl.cms.CollegeCrud;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/hcljava/CMS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CMS/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1567574381315L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("com.hcl.cms.CollegeCrud");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		CollegeCrud crud = new CollegeCrud();
		String fid = crud.getFeedbackId();
		List<String> instructors = crud.getInstructors();
	
      out.write("\r\n");
      out.write("\t<form action=\"Feedback.jsp\" name=\"formFeedback\"/>\r\n");
      out.write("\t\tFeedback ID : <input type=\"text\" name=\"fid\" readonly value=");
      out.print(fid );
      out.write(" /><br/>\r\n");
      out.write("\t\tStudent Name:<input type=\"text\" name=\"studentName\" />");
 out.println(request.getParameter("studentName")); 
      out.write("<br/><br/>\r\n");
      out.write("\t\tInstructor : <select id=\"insDropDown\" name=\"insDropDown\" onchange=\"getSubjects()\">\r\n");
      out.write("\t\t\t\t\t\t<option>Select Any One</option>\r\n");
      out.write("\t\t\t\t\t\t");

												
							for(String ins : instructors) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(ins);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(ins);
      out.write(" </option>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</select>\t\r\n");
      out.write("\t");

		session.setAttribute("fid",fid);
	    session.setAttribute("studentName",request.getParameter("studentName"));
	    session.setAttribute("ins", request.getParameter("insDropDown"));   
    
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction getSubjects(){\r\n");
      out.write("\t\t\tdocument.formFeedback.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("   <form mtehod=\"post\" action=\"ConfirmFeedbackForm.jsp\"><br/><br/>\r\n");
      out.write("\tPlease Provide Feedback:<br/><br/>\r\n");
      out.write("\t\tSubjects : <select id=\"subDropDown\" name=\"subDropDown\" >\r\n");
      out.write("\t\t\t\t\t\t");

							List<String> list = new CollegeCrud().getSubjectsByInstructor(request.getParameter("insDropDown"));
							for(String s : list) {
								
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(s);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(s);
      out.write(" </option>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t</select>\t<br/><br/>\r\n");
      out.write("\t    <input type=\"radio\" id=\"Choice1\"\r\n");
      out.write("     name=\"feedback\" value=\"Excellent\">\r\n");
      out.write("    <label for=\"Choice1\">Excellent</label>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"radio\" id=\"Choice2\"\r\n");
      out.write("     name=\"feedback\" value=\"Good\">\r\n");
      out.write("    <label for=\"Choice2\">Good</label>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"radio\" id=\"Choice3\" \r\n");
      out.write("     name=\"feedback\" value=\"Adequate\">\r\n");
      out.write("    <label for=\"Choice3\">Adequate</label>\r\n");
      out.write("\r\n");
      out.write("    <input type=\"radio\" id=\"Choice4\"\r\n");
      out.write("     name=\"feedback\" value=\"Inadequate\">\r\n");
      out.write("    <label for=\"Choice4\">Inadequate</label>\r\n");
      out.write("\t<input type=\"submit\" value=\"Show\" />\r\n");
      out.write("</form> \t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
