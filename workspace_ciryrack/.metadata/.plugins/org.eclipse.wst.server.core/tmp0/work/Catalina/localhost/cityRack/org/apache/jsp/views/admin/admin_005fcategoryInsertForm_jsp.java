/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-03-05 04:31:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fcategoryInsertForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/admin/common/footer.jsp", Long.valueOf(1519663480831L));
    _jspx_dependants.put("/views/admin/common/header.jsp", Long.valueOf(1520223447831L));
  }

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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script defer src=\"https://use.fontawesome.com/releases/v5.0.6/js/all.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t@import url(\"css/common.css\");\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\t\r\n");
      out.write("\t.tableArea {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 500px;\r\n");
      out.write("\t\tmargin-left: auto;\r\n");
      out.write("\t\tmargin-right: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\tth, td {\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<title>상품 관리</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<header>\r\n");
      out.write("\t<div>\t\r\n");
      out.write("\t\t<div id=\"logout\" align=\"right\">\r\n");
      out.write("\t\t\t<img alt=\"\" src=\"../logo.jpg\" style=\"\" align=\"left\">\r\n");
      out.write("\t\t\t관리자님 환영합니다.&nbsp;\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn btn-default\" role=\"button\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp;로그아웃</a>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<nav class=\"navbar navbar-inverse\" id=\"menubar\" style=\"width: 99%\">\r\n");
      out.write("\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t<li class=\"menuNav\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/index.jsp\" class=\"home\" style=\"color: white;\">HOME</a></li>\r\n");
      out.write("\t\t<li class=\"menuNav\">\r\n");
      out.write("       \t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">회원 관리\r\n");
      out.write("        \t<span class=\"caret\"></span></a>\r\n");
      out.write("\t        <ul class=\"dropdown-menu\">\r\n");
      out.write("\t          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_memberList.jsp\">회원 정보</a></li>\r\n");
      out.write("\t          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_gradeList.jsp\">등급 정보</a></li>\r\n");
      out.write("\t          <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_memberWithdrawList.jsp\">회원 탈퇴 정보</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("      \t</li>\r\n");
      out.write("\t\t<li class=\"menuNav\">\r\n");
      out.write("       \t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">상품 관리\r\n");
      out.write("        \t<span class=\"caret\"></span></a>\r\n");
      out.write("\t        <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_productList.jsp\">상품 정보</a></li>\r\n");
      out.write("\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_categoryList.jsp\">카테고리 정보</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("      \t</li>\r\n");
      out.write("\t\t<li class=\"menuNav\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_stockList.jsp\">재고 관리</a></li>\r\n");
      out.write("\t\t<li class=\"menuNav\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_orderList.jsp\">주문 관리</a></li>\r\n");
      out.write("\t\t<li class=\"menuNav\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">배송 관리\r\n");
      out.write("        \t<span class=\"caret\"></span></a>\r\n");
      out.write("\t        <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_deliverySearch.jsp\">배송 정보 검색</a></li>\r\n");
      out.write("\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_deliveryInvocenoResister.jsp\">운송장 번호 등록</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("      \t</li>\r\n");
      out.write("\t\t<li class=\"menuNav\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_paymentSearch.jsp\">결제 관리</a></li>\r\n");
      out.write("\t\t<li class=\"menuNav\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/admin/admin_boardList.jsp\">게시판 관리</a></li>\t\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<section>\t\r\n");
      out.write("\t\t<div class=\"tableArea\" align=\"center\">\r\n");
      out.write("\t\t\t<h2>카테고리 추가</h2><br>\r\n");
      out.write("\t\t\t<form action=\"\" method=\"get\">\r\n");
      out.write("\t\t\t\t<table style=\"width: 30%\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">카테고리 추가</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>카테고리명</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"garde_name\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button onclick=\"\">추가</button>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<button onclick=\"dropOut();\">삭제</button>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction dropOut(){\r\n");
      out.write("\t\t\t\tvar result = window.confirm(\"관리자등급을 삭제하시겠습니까?\");\r\n");
      out.write("\t\t\t\tif(result==true){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<br><br><br>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<p><i class=\"fab fa-facebook-f\"></i>&nbsp;&nbsp;&nbsp;<i class=\"fab fa-twitter\"></i>&nbsp;&nbsp;&nbsp;<i class=\"fab fa-instagram\"></i></p>\r\n");
      out.write("\t\t<p>팀명 : 식사는 하셨조 | 팀장 : 유기환 팀원 : 한정란, 박승정, 이훈택, 유민수</p>\r\n");
      out.write("\t\t<p>사업자등록번호 : 103-17-24162 | 통신판매업신고번호 : 제 2016-서울서대문-0066</p>\r\n");
      out.write("\t\t<p>서울특별시 강남구 테헤란로 14길 6</p>\r\n");
      out.write("\t\t<p>고객지원 : 문의 게시판 또는 010-4949-4949 (운영시간 12:00 ~ 13:00 주말/공휴일은 제외)</p>\r\n");
      out.write("\t\t<p>이용약관 | 개인정보처리방침</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
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
