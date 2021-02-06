package org.apache.jsp.WEB_002dINF.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class articlelist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\"  rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("font-awesome/css/font-awesome.css\"  rel=\"stylesheet\">\n");
      out.write("    <!-- Data Tables -->\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/plugins/dataTables/dataTables.bootstrap.css\"  rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/animate.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/flavr.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("/js/zTree_v3/css/zTreeStyle/zTreeStyle.css\" type=\"text/css\">\n");
      out.write("\t<style>\n");
      out.write("\t\t.btn-circle {\n");
      out.write("\t\t  width: 20px;\n");
      out.write("\t\t  height: 20px;\n");
      out.write("\t\t  border-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.fa{\n");
      out.write("\t\t\n");
      out.write("\t\t  position: relative;\n");
      out.write("\t\t  top: -3px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"javascript:void(0)\"><i class=\"fa fa fa-volume-up\"></i>\n");
      out.write("                        \t<span class=\"nav-label\">文章管理</span>\n");
      out.write("                        \t<span class=\"fa arrow\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                            \t<a href=\"");
      out.print(basePath);
      out.write("admin/article/list\">文章列表</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"javascript:void(0)\"><i class=\"fa fa fa-qrcode\"></i>\n");
      out.write("                        \t<span class=\"nav-label\">标签管理</span>\n");
      out.write("                        \t<span class=\"fa arrow\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"\">标签列表</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\n");
      out.write("            <div class=\"row wrapper border-bottom white-bg page-heading\">\n");
      out.write("                <div class=\"col-lg-10\">\n");
      out.write("                    <h2>文章列表</h2>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print(basePath);
      out.write("admin/home\">主页</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a>文章管理</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <strong>文章列表</strong>\n");
      out.write("                        </li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper wrapper-content animated fadeInRight\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"ibox float-e-margins\">\n");
      out.write("                            <div class=\"ibox-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3 m-b-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"categoryId\" name=\"categoryId\" class=\"input-sm form-control input-s-sm inline\" style=\"font-size: 12px;\">\n");
      out.write("\t                                            <option value=\"-1\">请选择栏目</option>\n");
      out.write("\t                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t                                        </select>\n");
      out.write("\t                                    </div>\n");
      out.write("\t                                    <div class=\"col-sm-3 m-b-xs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"tagId\" name=\"tagId\" class=\"input-sm form-control input-s-sm inline\" style=\"font-size: 12px;\">\n");
      out.write("\t                                            <option value=\"-1\">请选择标签</option>\n");
      out.write("\t                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t                                        </select>\n");
      out.write("\t                                    </div>\n");
      out.write("\t                                    <div class=\"col-sm-3\">\n");
      out.write("\t\t                                        <div class=\"input-group\">\n");
      out.write("\t\t                                            <input type=\"text\" id=\"keyword\" placeholder=\"请输入标题\" class=\"input-sm form-control\" style=\"font-size: 12px;\">\n");
      out.write("\t\t                                            <span class=\"input-group-btn\">\n");
      out.write("\t\t                                        \t\t<button type=\"button\" class=\"btn btn-sm btn-primary\" onclick=\"search()\">搜索</button>\n");
      out.write("\t\t                                        \t</span>\n");
      out.write("\t\t                                        </div>\n");
      out.write("\t                                    </div>\n");
      out.write("\t                                    \n");
      out.write("\t                                    <button type=\"button\" class=\"btn btn-sm btn-danger\" onclick=\"addArticle()\">新增文章</button>\n");
      out.write("\t                                    ");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <!-- 表格数据 -->\n");
      out.write("                                <div id=\"dataList\">\n");
      out.write("\t                                \n");
      out.write("\t                                \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- 编辑页面 -->\n");
      out.write("    <div class=\"modal inmodal\" id=\"editArticleModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div id=\"editArticleContent\" class=\"modal-body\">\n");
      out.write("            \n");
      out.write("            </div>                  \n");
      out.write("        </div>\t\t\t\t\t\t\t\t\t\t\t                                    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- 新增页面 -->\n");
      out.write("    <div class=\"modal inmodal\" id=\"addArticleModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t<div id=\"addArticleContent\" class=\"modal-body\">\n");
      out.write("            \t\n");
      out.write("            </div>                  \n");
      out.write("        </div>\t\t\t\t\t\t\t\t\t\t\t\t                                    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Mainly scripts -->\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/hplus.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/pace/pace.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/validation.js\"></script>\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/article/article.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/js/flavr.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/base.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/zTree_v3/js/jquery.ztree.all-3.5.js\"></script>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t                                            ");
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("tag");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t                                            ");
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
