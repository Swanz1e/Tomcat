/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2024-11-12 00:19:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write('\n');
      out.write('\n');

/**
 This application is for demonstration use only. It contains known application security
vulnerabilities that were created expressly for demonstrating the functionality of
application security testing tools. These vulnerabilities may present risks to the
technical environment in which the application is installed. You must delete and
uninstall this demonstration application upon completion of the demonstration for
which it is intended. 

IBM DISCLAIMS ALL LIABILITY OF ANY KIND RESULTING FROM YOUR USE OF THE APPLICATION
OR YOUR FAILURE TO DELETE THE APPLICATION FROM YOUR ENVIRONMENT UPON COMPLETION OF
A DEMONSTRATION. IT IS YOUR RESPONSIBILITY TO DETERMINE IF THE PROGRAM IS APPROPRIATE
OR SAFE FOR YOUR TECHNICAL ENVIRONMENT. NEVER INSTALL THE APPLICATION IN A PRODUCTION
ENVIRONMENT. YOU ACKNOWLEDGE AND ACCEPT ALL RISKS ASSOCIATED WITH THE USE OF THE APPLICATION.

IBM AltoroJ
(c) Copyright IBM Corp. 2008, 2013 All Rights Reserved.
*/

      out.write(" \n");
      out.write("    \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jspf", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"wrapper\" style=\"width: 99%;\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/toc.jspf", out, false);
      out.write("\n");
      out.write("   <td valign=\"top\" colspan=\"3\" class=\"bb\">\n");
      out.write("\t\t<div class=\"fl\" style=\"width: 99%;\">\n");
      out.write("\t\t\n");
      out.write("\t\t<h1>Online Banking Login</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- To get the latest admin login, please contact SiteOps at 415-555-6159 -->\n");
      out.write("\t\t<p><span id=\"_ctl0__ctl0_Content_Main_message\" style=\"color:#FF0066;font-size:12pt;font-weight:bold;\">\n");
      out.write("\t\t");

		java.lang.String error = (String)request.getSession(true).getAttribute("loginError");
		
		if (error != null && error.trim().length() > 0){
			request.getSession().removeAttribute("loginError");
			out.print(error);
		}
		
      out.write("\n");
      out.write("\t\t</span></p>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"doLogin\" method=\"post\" name=\"login\" id=\"login\" onsubmit=\"return (confirminput(login));\">\n");
      out.write("\t\t  <table>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <td>\n");
      out.write("\t\t        Username:\n");
      out.write("\t\t      </td>\n");
      out.write("\t\t      <td>\n");
      out.write("\t\t        <input type=\"text\" id=\"uid\" name=\"uid\" value=\"\" style=\"width: 150px;\">\n");
      out.write("\t\t      </td>\n");
      out.write("\t\t      <td>\n");
      out.write("\t\t      </td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t      <td>\n");
      out.write("\t\t        Password:\n");
      out.write("\t\t      </td>\n");
      out.write("\t\t      <td>\n");
      out.write("\t\t        <input type=\"password\" id=\"passw\" name=\"passw\" style=\"width: 150px;\">\n");
      out.write("\t\t        </td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t\t    <tr>\n");
      out.write("\t\t        <td></td>\n");
      out.write("\t\t        <td>\n");
      out.write("\t\t          <input type=\"submit\" name=\"btnSubmit\" value=\"Login\">\n");
      out.write("\t\t        </td>\n");
      out.write("\t\t      </tr>\n");
      out.write("\t\t  </table>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tfunction setfocus() {\n");
      out.write("\t\t\t    if (document.login.uid.value==\"\") {\n");
      out.write("\t\t\t      \tdocument.login.uid.focus();\n");
      out.write("\t\t\t    } else {\n");
      out.write("\t\t\t      \tdocument.login.passw.focus();\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction confirminput(myform) {\n");
      out.write("\t\t\t    if (myform.uid.value.length && myform.passw.value.length) {\n");
      out.write("\t\t\t      return (true);\n");
      out.write("\t\t\t    } else if (!(myform.uid.value.length)) {\n");
      out.write("\t\t\t      myform.reset();\n");
      out.write("\t\t\t      myform.uid.focus();\n");
      out.write("\t\t\t      alert (\"You must enter a valid username\");\n");
      out.write("\t\t\t      return (false);\n");
      out.write("\t\t\t    } else {\n");
      out.write("\t\t\t      myform.passw.focus();\n");
      out.write("\t\t\t      alert (\"You must enter a valid password\");\n");
      out.write("\t\t\t      return (false);\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\twindow.onload = setfocus;\n");
      out.write("\t\t</script>\n");
      out.write("    </td>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jspf", out, false);
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
