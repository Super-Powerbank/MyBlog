package org.apache.jsp.WEB_002dINF.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.net.URLEncoder;
import com.tulun.blog.model.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\t<head>\r\n");
      out.write("<link rel=\"stylesheet\" id=\"main-css\" href=\"");
      out.print(basePath);
      out.write("css/demo/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=11,IE=10,IE=9,IE=8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<meta name=\"baidu-site-verification\" content=\"emEdenaBVA\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\">\r\n");
      out.write("<title>博客系统</title>\r\n");
      out.write("<meta name=\"description\" content=\"coriger 夏末冬初  \r\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"coriger 夏末冬初  \r\n");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\"/>\r\n");
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
      out.write("<li class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-61\">\r\n");
      out.write("\t<a href=\"\">\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-home\"></span>首页\r\n");
      out.write("\t</a>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_2.setVar("category");
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<li class=\"menu-item menu-item-type-taxonomy menu-item-object-category menu-item-61\">\r\n");
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
            int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("</ul>\t\t<div class=\"widget_head\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("    <div class=\"content-wrap\">\r\n");
      out.write("\t    <div class=\"content\" id=\"content\">\r\n");
      out.write("\t\t\t<h3 class=\"title\"><strong>最新发布</strong></h3>\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"categoryId\" value=\"-1\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<aside class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"widget widget_tags\">\r\n");
      out.write("   <h3 class=\"title\"><strong>热门标签</strong></h3>\r\n");
      out.write("   <ul class=\"widget_tags_inner\">\r\n");
      out.write("   \t");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\t</aside>\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/article/article_list.js\"></script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("tag");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("category");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
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

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("tag");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   \t\t<li><a title=\"\" href=\"javascript:;\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("   \t");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
