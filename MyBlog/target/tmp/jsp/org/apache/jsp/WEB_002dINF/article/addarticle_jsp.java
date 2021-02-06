package org.apache.jsp.WEB_002dINF.article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addarticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("font-awesome/css/font-awesome.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <!-- Data Tables -->\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/plugins/dataTables/dataTables.bootstrap.css\"  rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/animate.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/css/flavr.css\" />\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/plugins/datapicker/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/plugins/chosen/chosen.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.input-upload{ position: relative;}\r\n");
      out.write("\t\t.input-upload input[type=\"file\"]{ position: absolute; left: 0px; top: 0px; width: 72px; height: 35px; opacity:.0;filter:alpha(opacity=00);}\r\n");
      out.write("\t</style>\r\n");
      out.write("<title>新增博客</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("    <div class=\"sidebar-collapse\">\r\n");
      out.write("    <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\r\n");
      out.write("    <li class=\"active\">\r\n");
      out.write("    <a href=\"javascript:void(0)\"><i class=\"fa fa fa-volume-up\"></i>\r\n");
      out.write("    <span class=\"nav-label\">文章管理</span>\r\n");
      out.write("    <span class=\"fa arrow\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"nav nav-second-level\">\r\n");
      out.write("    <li class=\"active\">\r\n");
      out.write("    <a href=\"");
      out.print(basePath);
      out.write("admin/article/list\">文章列表</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <a href=\"javascript:void(0)\"><i class=\"fa fa fa-qrcode\"></i>\r\n");
      out.write("    <span class=\"nav-label\">标签管理</span>\r\n");
      out.write("    <span class=\"fa arrow\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"nav nav-second-level\">\r\n");
      out.write("    <li>\r\n");
      out.write("    <a href=\"\">标签列表</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("                <div class=\"col-lg-10\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"ibox float-e-margins\">\r\n");
      out.write("                            <div class=\"ibox-content\">\r\n");
      out.write("                                <form method=\"get\" class=\"form-horizontal\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">栏目:</label>\r\n");
      out.write("                                        <div class=\"col-sm-4\">\r\n");
      out.write("                                            <select class=\"form-control m-b\" id=\"categoryId\">\r\n");
      out.write("                                            \t<option value=\"-1\">无</option>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">博客标题</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"text\" id=\"title\" class=\"form-control\" placeholder=\"请填写博客名\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"hr-line-dashed\"></div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">博客内容:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                        \t<script id=\"editor\" type=\"text/plain\"></script>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"hr-line-dashed\"></div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label class=\"col-sm-2 control-label\">标签:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <select data-placeholder=\"请选择标签\" class=\"chosen-select\" multiple style=\"width:450px;\" tabindex=\"5\">\r\n");
      out.write("\t                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                                        </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-sm-4 col-sm-offset-2\">\r\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\" onclick=\"saveArticle()\">保存</button>\r\n");
      out.write("                                            <button class=\"btn btn-white\" type=\"button\" onclick=\"cancelSaveArticle()\">取消</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Mainly scripts -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/hplus.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/validation.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/article/add_article.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/flavr/js/flavr.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/flavr/base.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/zTree_v3/js/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/plugins/datapicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<!-- �����ļ� -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/ueditor.config.js\"></script>\r\n");
      out.write("    <!-- �༭��Դ���ļ� -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/ueditor.all.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/lang/zh-cn/zh-cn.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ajaxfileupload.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/plugins/chosen/chosen.jquery.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/imageUtils.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function () {\r\n");
      out.write("            var UEDITOR_HOME_URL = \"/js/ueditor1_4_3/\";\r\n");
      out.write("        \tvar ue = UE.getEditor('editor');\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// ��ʼ����ѡ��\r\n");
      out.write("        $(\".chosen-select\").chosen({\r\n");
      out.write("\t\t\tmax_selected_options:5,\r\n");
      out.write("\t\t\tno_results_text:\"û���ҵ�\",\r\n");
      out.write("\t\t\tallow_single_deselect:true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                                ");
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
          out.write("\r\n");
          out.write("\t                                            \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" hassubinfo=\"true\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag.tagName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
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
