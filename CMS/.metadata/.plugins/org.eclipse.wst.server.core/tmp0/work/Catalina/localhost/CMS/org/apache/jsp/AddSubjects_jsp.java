/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-09-04 06:51:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hcl.cms.Subjects;
import com.hcl.cms.CollegeCrud;

public final class AddSubjects_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.hcl.cms.CollegeCrud");
    _jspx_imports_classes.add("com.hcl.cms.Subjects");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"get\" action=\"AddSubjects.jsp\" name=\"subForm\">\r\n");
      out.write("\t\t<select id=\"subject\" name=\"subject\" onchange=\"change()\">\r\n");
      out.write("\t\t\t <option value=\"dropdown\">Pls select one</option>\r\n");
      out.write("                <option value=\"TOC\">TOC</option>\r\n");
      out.write("                <option value=\"DBMS\">DBMS</option>\r\n");
      out.write("                <option value=\"AI\">AI</option>\r\n");
      out.write("                <option value=\"Microprocessor Interfacing\">Microprocessor Interfacing</option>\r\n");
      out.write("                <option value=\"C#\">C#</option>\r\n");
      out.write("                <option value=\"Operating System\">Operating System</option>\r\n");
      out.write("                <option value=\"SQL Server\">SQL Server</option>\r\n");
      out.write("                <option value=\"Networking\">Networking</option>\r\n");
      out.write("\t\t</select><br/><br/>\r\n");
      out.write("\t\tTheory    : <input type=\"text\" readonly id=\"theory\" name=\"theory\" /><br/><br/>\r\n");
      out.write("\t\tPractical : <input type=\"text\" readonly id=\"practical\" name=\"practical\"/><br/><br/>\r\n");
      out.write("\t\tYear      : <input type=\"text\" name=\"year\" /><br/><br/>\r\n");
      out.write("\t\tInstructor: <input type=\"text\" name=\"instructor\"/><br/><br/>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Submit\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction change(){\r\n");
      out.write("        var dval= document.getElementById(\"subject\").value;\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        if(dval ==\"TOC\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"42\";\r\n");
      out.write("        \tsubForm.practical.value=\"14\";\r\n");
      out.write("        }\r\n");
      out.write("        if(dval ==\"DBMS\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"90\";\r\n");
      out.write("        \tsubForm.practical.value=\"50\";\r\n");
      out.write("        }\r\n");
      out.write("        if(dval ==\"AI\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"69\";\r\n");
      out.write("        \tsubForm.practical.value=\"41\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"PC Hardware 2\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"69\";\r\n");
      out.write("        \tsubForm.practical.value=\"41\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"Microprocessor Interfacing\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"107\";\r\n");
      out.write("        \tsubForm.practical.value=\"93\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"C#\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"84\";\r\n");
      out.write("        \tsubForm.practical.value=\"56\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"Data Structures\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"60\";\r\n");
      out.write("        \tsubForm.practical.value=\"0\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"Operating System\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"80\";\r\n");
      out.write("        \tsubForm.practical.value=\"70\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"SQL Server\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"66\";\r\n");
      out.write("        \tsubForm.practical.value=\"34\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(dval ==\"Networking\"){\r\n");
      out.write("        \t//alert(\"hi\");\r\n");
      out.write("        \tsubForm.theory.value=\"94\";\r\n");
      out.write("        \tsubForm.practical.value=\"156\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        }\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	
	
		if(request.getParameter("subject") != null &&
				request.getParameter("theory") != null &&
				request.getParameter("practical") != null &&
				request.getParameter("year") != null &&
				request.getParameter("instructor") != null 
				) {
			CollegeCrud crud = new CollegeCrud();
			Subjects subject = new Subjects();
			subject.setSubject(request.getParameter("subject"));
			subject.setInstructor(request.getParameter("instructor"));
			subject.setPractical(Integer.parseInt(request.getParameter("practical")));
			subject.setTheory(Integer.parseInt(request.getParameter("theory")));
			subject.setYear(Integer.parseInt(request.getParameter("year")));
			
			crud.addSubject(subject);
		}
			
	
	
      out.write("\r\n");
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
