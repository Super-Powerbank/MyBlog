package org.apache.jsp.WEB_002dINF.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class add_005farticle_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("        <head>\n");
      out.write("                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB18030\">\n");
      out.write("                <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\"  rel=\"stylesheet\">\n");
      out.write("                <link href=\"");
      out.print(basePath);
      out.write("css/style.css\" rel=\"stylesheet\">\n");
      out.write("                <title>新增博客</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"ibox-content\">\n");
      out.write("                <form method=\"get\" class=\"form-horizontal\">\n");
      out.write("                    <div class=\"hr-line-dashed\"></div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-sm-2 control-label\">内容:</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <script id=\"editor\" type=\"text/plain\"></script>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                       <div class=\"col-sm-4 col-sm-offset-2\">\n");
      out.write("                           <button class=\"btn btn-primary\" type=\"button\" onclick=\"saveArticle()\">保存内容</button>\n");
      out.write("                           <button class=\"btn btn-white\" type=\"button\" onclick=\"cancelSaveArticle()\">取消</button>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Mainly scripts -->\n");
      out.write("                <script src=\"");
      out.print(basePath);
      out.write("js/jquery-2.1.1.min.js\"></script>\n");
      out.write("                <script src=\"");
      out.print(basePath);
      out.write("js/bootstrap.min.js\"></script>\n");
      out.write("                <script src=\"");
      out.print(basePath);
      out.write("js/article/add_article_test.js\"></script>\n");
      out.write("                <!-- 配置文件 -->\n");
      out.write("                <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/ueditor.config.js\"></script>\n");
      out.write("                <!-- 编辑器源码文件 -->\n");
      out.write("                <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/ueditor.all.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" charset=\"utf-8\" src=\"");
      out.print(basePath);
      out.write("js/ueditor1_4_3/lang/zh-cn/zh-cn.js\"></script>\n");
      out.write("                <script src=\"");
      out.print(basePath);
      out.write("js/plugins/chosen/chosen.jquery.js\"></script>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    var ue = UE.getEditor('editor');\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                // 初始化多选框\n");
      out.write("                $(\".chosen-select\").chosen({\n");
      out.write("                   max_selected_options:5,\n");
      out.write("                   no_results_text:\"没有找到\",\n");
      out.write("                   allow_single_deselect:true\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </body>\n");
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
