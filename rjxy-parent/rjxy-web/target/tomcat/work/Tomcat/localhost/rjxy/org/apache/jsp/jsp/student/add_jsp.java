/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-09 03:23:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<TITLE>添加客户</TITLE> \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/Manage.css\" type=text/css\r\n");
      out.write("\trel=stylesheet>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\t<FORM id=\"input\" name=form1\r\n");
      out.write("\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/AddStudentServlet\"\r\n");
      out.write("\t\tmethod=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_019.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=\"100%\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_020.jpg\"\r\n");
      out.write("\t\t\t\t\t\theight=20></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_021.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_022.jpg><IMG\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_022.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD vAlign=top width=\"100%\" bgColor=#ffffff>\r\n");
      out.write("\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD class=manageHead>当前位置：评价管理 &gt; 添加评价</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD height=2></TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=5  border=0>\r\n");
      out.write("\t\t\t\t\t\t  <h3>请您对框架进行评价</h3>\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"radio\" name=\"name\" value=\"掌握\" checked=\"checked\" />\r\n");
      out.write("  \t\t\t\t\t\t掌握\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"radio\" name=\"name\" value=\"有点印象\" /> \r\n");
      out.write("  \t\t\t\t\t\t有点印象\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"radio\" name=\"name\" value=\"不太明白\" /> \r\n");
      out.write("  \t\t\t\t\t\t不太明白\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"radio\" name=\"name\" value=\"不感兴趣\" /> \r\n");
      out.write("  \t\t\t\t\t\t不感兴趣\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"radio\" name=\"name\" value=\"需要看视频才能看懂\" />  \r\n");
      out.write("  \t\t\t\t\t\t需要看视频才能看懂\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>学生姓名：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>学生学号 ：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>班级 ：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_source\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>联系人：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_linkman\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>固定电话 ：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_phone\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>移动电话 ：</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=textbox id=sChannel2\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"WIDTH: 180px\" maxLength=50 name=\"cust_mobile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</TR> -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td rowspan=2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT class=button id=sButton2 type=submit\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\" 保存 \" name=sButton2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15 background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_023.jpg\">\r\n");
      out.write("\t\t\t\t\t<IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_023.jpg\" border=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_024.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t\t<TD align=middle width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\tbackground=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_025.jpg\" height=15></TD>\r\n");
      out.write("\t\t\t\t\t<TD width=15><IMG src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/new_026.jpg\"\r\n");
      out.write("\t\t\t\t\t\tborder=0></TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t // $(function(){\r\n");
      out.write("\t //    \t/** 部门表单提交 */\r\n");
      out.write("\t\t// \t$(\"#addForm\").click(function(){\r\n");
      out.write("\t\t// \t\tvar name = $(\"#name1\");\r\n");
      out.write("\t\t// \t\tvar msg = \"\";\r\n");
      out.write("\t\t// \t\tif ($.trim(name.val()) == \"\"){\r\n");
      out.write("\t\t// \t\t\tmsg = \"名称不能为空！\";\r\n");
      out.write("\t\t// \t\t\tname.focus();\r\n");
      out.write("\t\t// \t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t// \t\tif (msg != \"\"){\r\n");
      out.write("\t\t// \t\t\t$.ligerDialog.error(msg);\r\n");
      out.write("\t\t// \t\t\treturn false;\r\n");
      out.write("\t\t// \t\t}else{\r\n");
      out.write("\t\t// \t\t\treturn true;\r\n");
      out.write("\t\t// \t\t}\r\n");
      out.write("\t\t// \t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/evaluate/add.do\", \r\n");
      out.write("\t\t// \t\t\t\t$(\"#addForm\").serialize(), function (data){\r\n");
      out.write("\t\t// \t\t\tif (data ==\"OK\"){\r\n");
      out.write("\t\t// \t\t\t\talert(\"职位成功\");\r\n");
      out.write("\t\t// \t\t\t/* \twindow.location.href:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dept/queryDept.do\"; */\r\n");
      out.write("\t\t// \t\t\t}else{\r\n");
      out.write("\t\t// \t\t\t\talert(\"失败\")\r\n");
      out.write("\t\t// \t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t// \t\t\t}\r\n");
      out.write("\t\t// \t\t});\r\n");
      out.write("\t\t// \t});\r\n");
      out.write("\t //    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar Oinput = document.getElementById(\"input\");\r\n");
      out.write("\t\tvar OBC = document.getElementById(\"SUBMIT\");\r\n");
      out.write("\r\n");
      out.write("\t\tOBC.onclick =function (){\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar obj = Oinput.getElementsByTagName(\"input\");\r\n");
      out.write("\t\t    for(var i=0; i<obj.length; i ++){\r\n");
      out.write("\t\t        if(obj[i].checked){\r\n");
      out.write("\t\t           //alert(obj[i].value);\r\n");
      out.write("\t\t           var OPJ = obj[i].value;\r\n");
      out.write("\t\t           \r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t     //alert(obj[i].value);    \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(OPJ);\r\n");
      out.write("\t\t\t// if(OPJ == \"undefined\"){\r\n");
      out.write("\t\t //           //alert(obj[i].value);\r\n");
      out.write("\t\t //          alert(\"失败\");\r\n");
      out.write("\t\t           \r\n");
      out.write("\t\t //        }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</HTML>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}