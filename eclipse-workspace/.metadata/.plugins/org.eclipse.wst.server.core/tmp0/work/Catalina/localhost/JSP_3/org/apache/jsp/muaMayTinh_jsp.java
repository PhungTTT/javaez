/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.78
 * Generated at: 2022-12-03 13:35:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class muaMayTinh_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"\n");
      out.write("	integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\"\n");
      out.write("	integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<h1>Chọn hình máy tính:</h1>\n");
      out.write("	<hr>\n");
      out.write("	<form>\n");
      out.write("		<h2>Processor</h2>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"processor\"\n");
      out.write("				id=\"corei5\" value=\"Core I5\"> <label class=\"form-check-label\"\n");
      out.write("				for=\"corei5\"> Core I5</label>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"processor\"\n");
      out.write("				id=\"corei7\" value=\"Core I7\"> <label\n");
      out.write("				class=\"form-check-label\" for=\"corei7\"> Core I7</label>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"processor\"\n");
      out.write("				id=\"corei9\" value=\"Core I9\"> <label\n");
      out.write("				class=\"form-check-label\" for=\"corei9\"> Core I9</label>\n");
      out.write("		</div>\n");
      out.write("		<!--  -->\n");
      out.write("		<h2>RAM</h2>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"ram\"\n");
      out.write("				id=\"ram8gb\" value=\"ram8gb\"> <label class=\"form-check-label\"\n");
      out.write("				for=\"ram8gb\"> Ram 8GB</label>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"radio\" name=\"ram\"\n");
      out.write("				id=\"ram16gb\" value=\"ram8gb\"> <label class=\"form-check-label\"\n");
      out.write("				for=\"ram16gb\"> Ram 16GB</label>\n");
      out.write("		</div>\n");
      out.write("		<!--  -->\n");
      out.write("		<h2>Monitor</h2>\n");
      out.write("		<div class=\"form-check\">\n");
      out.write("			<input class=\"form-check-input\" type=\"checkbox\"\n");
      out.write("				id=\"flexCheck\" value=\"ram8gb\"> <label class=\"form-check-label\"\n");
      out.write("				for=\"flexCheck\"> Disabled check checkbox</label>\n");
      out.write("		</div>\n");
      out.write("	</form> \n");
      out.write("</body>\n");
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
