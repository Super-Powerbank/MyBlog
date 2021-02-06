package org.apache.jsp.WEB_002dINF.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class articlepager1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html><head>\r\n");
      out.write("<link rel=\"stylesheet\" id=\"main-css\" href=\"");
      out.print(basePath);
      out.write("css/demo/style.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=11,IE=10,IE=9,IE=8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"baidu-site-verification\" content=\"emEdenaBVA\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" - 博客系统</title>\r\n");
      out.write("<meta name=\"description\" content=\"coriger 夏末冬初  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"coriger 夏末冬初  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\timg.wp-smiley,\r\n");
      out.write("\timg.emoji {\r\n");
      out.write("\t\tdisplay: inline !important;\r\n");
      out.write("\t\tborder: none !important;\r\n");
      out.write("\t\tbox-shadow: none !important;\r\n");
      out.write("\t\theight: 1em !important;\r\n");
      out.write("\t\twidth: 1em !important;\r\n");
      out.write("\t\tmargin: 0 .07em !important;\r\n");
      out.write("\t\tvertical-align: -0.1em !important;\r\n");
      out.write("\t\tbackground: none !important;\r\n");
      out.write("\t\tpadding: 0 !important;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"contain\" class=\"home blog ui-c3\">\r\n");
      out.write("<section class=\"container\">\r\n");
      out.write("<form method=\"get\" class=\"degfy_search_box\">\r\n");
      out.write("        <input class=\"degfy_search_input\" name=\"s\" type=\"text\" placeholder=\"输入关键字\" value=\"\">\r\n");
      out.write("</form>\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("    <div class=\"logo_right\"><span class=\"glyphicon glyphicon-search degfy_search\"></span></div>\r\n");
      out.write("    <div class=\"logo_left\"></div>\r\n");
      out.write("\t<h1 class=\"logo\"><a href=\"\">博客系统</a></h1>\r\n");
      out.write("\t<ul class=\"nav\">\r\n");
      out.write("\r\n");
      out.write("<li class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-home menu-item-61\">\r\n");
      out.write("\t<a href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-home\"></span>首页\r\n");
      out.write("\t</a>\r\n");
      out.write("</li>\r\n");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("category");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<li class=\"menu-item menu-item-type-taxonomy menu-item-object-category menu-item-61  \r\n");
            out.write("\t\t");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("\t\">\r\n");
            out.write("\t<a href=\"");
            out.print(basePath);
            out.write("loadPage1/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("\t\t<span class=\"glyphicon glyphicon-");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.iconClass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"></span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("\t</a></li>\r\n");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("</ul>\t\t<div class=\"widget_head\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"content-wrap\">\r\n");
      out.write("\t<div class=\"content\" id=\"content\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("    <h3 class=\"title\"><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></h3>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"categoryId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<aside class=\"sidebar\">\r\n");
      out.write("<div class=\"widget widget_tags\">\r\n");
      out.write("   <h3 class=\"title\"><strong>热门标签</strong></h3> \r\n");
      out.write("   <ul class=\"widget_tags_inner\"> \r\n");
      out.write("   \t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   </ul> \r\n");
      out.write("  </div> \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</aside>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div id=\"back_hidden\"></div>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/category/article_list.js\"></script>\r\n");
      out.write("<!-- <script src=\"//cdn.bootcss.com/jquery.lazyload/1.9.1/jquery.lazyload.js\"></script> -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- <script>\r\n");
      out.write("var _hmt = _hmt || [];\r\n");
      out.write("(function() {\r\n");
      out.write("  var hm = document.createElement(\"script\");\r\n");
      out.write("  hm.src = \"//hm.baidu.com/hm.js?790c0d88ebfcc979bcb6d95993bffb1d\";\r\n");
      out.write("  var s = document.getElementsByTagName(\"script\")[0]; \r\n");
      out.write("  s.parentNode.insertBefore(hm, s);\r\n");
      out.write("})();\r\n");
      out.write("\r\n");
      out.write("</script> -->\r\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.id == category.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\tcurrent_page_item \r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("tag");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   \t\t<li><a title=\"\" href=\"javascript:void(0)\" onclick=\"goTag('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li> \r\n");
          out.write("   \t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
