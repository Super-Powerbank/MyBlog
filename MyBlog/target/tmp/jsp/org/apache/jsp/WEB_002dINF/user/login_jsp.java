package org.apache.jsp.WEB_002dINF.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <title>后台  - 登录</title>\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\"  rel=\"stylesheet\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("font-awesome/css/font-awesome.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/animate.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/style.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/animate.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/flavr.css\" />\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/plugins/toastr/toastr.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t// 登录\r\n");
      out.write("\t\tfunction login(){\r\n");
      out.write("\t\t\tvar loginId = $(\"#loginId\").val();\r\n");
      out.write("\t\t\tvar password = $(\"#password\").val();\r\n");
      out.write("\t\t\tif(isEmpty(loginId)){\r\n");
      out.write("\t\t\t\ttoastr.error(\"账户不能为空\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(isEmpty(password)){\r\n");
      out.write("\t\t\t\ttoastr.error(\"密码不能为空\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"logininfo\",\r\n");
      out.write("\t\t\t\tdata: $(\"#form\").serialize(),\r\n");
      out.write("\t\t\t\tmethod : \"post\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data.resultCode == 'success') {\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"../articlelist\";\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\ttoastr.error(data.errorInfo);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}) \r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.loginscreen.middle-box{padding-top:260px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"middle-box text-center loginscreen  animated fadeInDown\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h1 class=\"logo-img\"></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <form id=\"form\" class=\"m-t\" role=\"form\" >\r\n");
      out.write("\t\t\t\t<div class=\"form-group\"><h2 >博客系统登录后台</h2></div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" name=\"userName\" id=\"loginId\" class=\"form-control\" placeholder=\"用户名\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"密码\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary block full-width m-b\" onclick=\"login()\">登 录</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\" ></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/js/flavr.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/base.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/validation.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/plugins/toastr/toastr.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
