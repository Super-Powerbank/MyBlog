package org.apache.jsp.WEB_002dINF.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class articlepager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write('\r');
      out.write('\n');
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("article");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<article class=\"excerpt excerpt-one\">\r\n");
            out.write("\t\t<header>\r\n");
            out.write("\t\t\t<a class=\"cat label label-important\" href=\"");
            out.print(basePath);
            out.write("loadPage1/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" data-original-title=\"\" title=\"\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("\t\t\t\t<i class=\"label-arrow\"></i>\r\n");
            out.write("\t\t\t</a>\r\n");
            out.write("\t\t\t<h2><a target=\"_blank\" href=\"");
            out.print(basePath);
            out.write("detail/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" title=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></h2>\r\n");
            out.write("\t\t</header>\r\n");
            out.write("\r\n");
            out.write("\t\t<p class=\"text-muted time\">作者：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;&nbsp;&nbsp; 发布于 ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("\r\n");
            out.write("\t\t<p class=\"focus\">\r\n");
            out.write("\t\t\t<a target=\"_blank\" href=\"");
            out.print(basePath);
            out.write("detail/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"thumbnail\">\r\n");
            out.write("\t\t\t\t<span class=\"item\">\r\n");
            out.write("\t\t\t\t\t<span class=\"thumb-span\">\r\n");
            out.write("\t\t\t\t\t</span>\r\n");
            out.write("\t\t\t\t</span>\r\n");
            out.write("\t\t\t</a>\r\n");
            out.write("\t\t</p>\r\n");
            out.write("<p class=\"note\">\r\n");
            out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substring(article.description, 0, 150)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("...\r\n");
            out.write("</p>\r\n");
            out.write("<p class=\"text-muted views\">\r\n");
            out.write("\t<span class=\"post-views\">阅读(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.showCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(")</span>\r\n");
            out.write("\t<span class=\"post-tags\">标签：\r\n");
            out.write("\t\t");
            if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("\t</span>\r\n");
            out.write("</p>\r\n");
            out.write("\r\n");
            out.write("</article>\r\n");
            out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${article.aTagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("tag");
    _jspx_th_c_forEach_1.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<a href=\"javascript:void(0)\" onclick=\"goTag('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" rel=\"tag\" data-original-title=\"\" title=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("\t\t");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(article.aTagList) > (status.index+1)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t/\r\n");
        out.write("\t\t\t");
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
}
