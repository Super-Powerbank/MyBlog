package org.apache.jsp.WEB_002dINF.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class articledetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html><head>\r\n");
      out.write("<link rel=\"stylesheet\" id=\"main-css\" href=\"");
      out.print(basePath);
      out.write("css/demo/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/third-party/SyntaxHighlighter/shCoreDefault.min.css\" rel=\"stylesheet\" type=\"text/css\" />  \r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=11,IE=10,IE=9,IE=8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<meta name=\"baidu-site-verification\" content=\"emEdenaBVA\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\">\r\n");
      out.write("<title> 博客系统</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"contain\" class=\"home blog ui-c3\">\r\n");
      out.write("<section class=\"container\">\r\n");
      out.write("\r\n");
      out.write("     ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("    <div class=\"logo_right\"><span class=\"glyphicon glyphicon-search degfy_search\"></span></div>\r\n");
      out.write("    <div class=\"logo_left\"></div>\r\n");
      out.write("\t<h1 class=\"logo\"><a href=\"\">博客系统</a></h1>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"widget_head\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"content-wrap\">\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<header class=\"article-header\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"article-meta\">\r\n");
      out.write("\t\t\t\t<li>作者：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;发布于:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("\t\t\t\t<li>分类：<a href=\"");
      out.print(basePath);
      out.write("category/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.aliasName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"category tag\" data-original-title=\"\" title=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<article class=\"article-content\">\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<aside class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("   \t\t");
      out.write("\r\n");
      out.write("   \t\t");
      out.write("\r\n");
      out.write("   \t\t\t");
      out.write("\r\n");
      out.write("   \t\t\t\t");
      out.write("\r\n");
      out.write("   \t\t\t");
      out.write("\r\n");
      out.write("   \t\t");
      out.write("\r\n");
      out.write("  \t");
      out.write("\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("</aside>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div id=\"back_hidden\"></div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://libs.baidu.com/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery.lazyload/1.9.1/jquery.lazyload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/third-party/SyntaxHighlighter/shCore.min.js\"></script>  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("        SyntaxHighlighter.highlight();\r\n");
      out.write("\r\n");
      out.write("        window.changyan.api.config({\r\n");
      out.write("        \tappid: 'cyrXo6KDF',\r\n");
      out.write("        \tconf: 'prod_4489406abc9bd36460f352f93cee965f'\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("        var _hmt = _hmt || [];\r\n");
      out.write("        var hm = document.createElement(\"script\");\r\n");
      out.write("  \t\thm.src = \"//hm.baidu.com/hm.js?790c0d88ebfcc979bcb6d95993bffb1d\";\r\n");
      out.write("  \t\tvar s = document.getElementsByTagName(\"script\")[0];\r\n");
      out.write("  \t\ts.parentNode.insertBefore(hm, s);\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function goTag(tagName){\r\n");
      out.write("\t//window.location.href = \"http://coriger.com/tag/\"+encodeURI(encodeURI(tagName))\r\n");
      out.write("\tvar hrefURL = getRootPath()+\"tag/\"+encodeURI(encodeURI(tagName));\r\n");
      out.write("\talert(hrefURL);\r\n");
      out.write("\twindow.location.href = getRootPath()+\"tag/\"+encodeURI(encodeURI(tagName))\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getRootPath() {\r\n");
      out.write("\t//获取当前网址，如： http://localhost:8080/GameFngine/share/meun.jsp\r\n");
      out.write("\tvar curWwwPath = window.document.location.href;\r\n");
      out.write("\t//获取主机地址之后的目录，如： GameFngine/meun.jsp\r\n");
      out.write("\tvar pathName = window.document.location.pathname;\r\n");
      out.write("\tvar pos = curWwwPath.indexOf(pathName);\r\n");
      out.write("\t//获取主机地址，如： http://localhost:8080\r\n");
      out.write("\tvar localhostPaht = curWwwPath.substring(0, pos);\r\n");
      out.write("\t//获取带\"/\"的项目名，如：/GameFngine\r\n");
      out.write("\tvar projectName = pathName.substring(0,\r\n");
      out.write("\t\t\tpathName.substr(1).indexOf('/') + 1);\r\n");
      out.write("\treturn (localhostPaht + projectName + \"/\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
