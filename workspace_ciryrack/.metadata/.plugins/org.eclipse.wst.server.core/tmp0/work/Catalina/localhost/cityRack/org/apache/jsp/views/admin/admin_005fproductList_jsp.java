/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-03-05 04:27:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fproductList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/admin/../admin/common/header.jsp", Long.valueOf(1520223447831L));
    _jspx_dependants.put("/views/admin/../admin/common/footer.jsp", Long.valueOf(1519663480831L));
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
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t@import url(\"css/common.css\");\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tborder-collapse: collapse;\t\r\n");
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
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t}\r\n");
      out.write("\tth {\r\n");
      out.write("\t\tbackground: lightgray;\r\n");
      out.write("\t}\r\n");
      out.write("\t.statusButton {\r\n");
      out.write("\t\tdisplay:  inline-block;\r\n");
      out.write("\t\twidth: 40%;\r\n");
      out.write("\t\theight: 50%;\r\n");
      out.write("\t\tmargin: 0.05em;\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
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
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h2>상품 정보</h2><br>\r\n");
      out.write("\t\t<form action=\"\" method=\"get\">\r\n");
      out.write("\t\t\t<input type=\"checkbox\" value=\"new\" id=\"new\" name=\"new\">\r\n");
      out.write("\t\t\t<label for=\"new\">NEW</label>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" value=\"sale\" id=\"sale\" name=\"sale\">\r\n");
      out.write("\t\t\t<label for=\"new\">SALE</label>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"checkbox\" value=\"hot\" id=\"hot\" name=\"hot\">\r\n");
      out.write("\t\t\t<label for=\"hot\">HOT</label>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<select id=\"searchCondition\" name=\"searchCondition\" onchange=\"selectSearch();\">\r\n");
      out.write("\t\t\t\t<option value=\"pcode\">상품코드</option>\r\n");
      out.write("\t\t\t\t<option value=\"pdate\">등록일</option>\r\n");
      out.write("\t\t\t\t<option value=\"pcategory\">카테고리명</option>\r\n");
      out.write("\t\t\t\t<option value=\"constitution\">체질명</option>\r\n");
      out.write("\t\t\t\t<option value=\"pname\">상품명</option>\r\n");
      out.write("\t\t\t\t<option value=\"status\">진열상태</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"search\" name=\"searchText\" id=\"searchText\">\r\n");
      out.write("\t\t\t<span id=\"serachDate\" hidden=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"date\" name=\"beforeDate\" id=\"beforeDate\"> -\r\n");
      out.write("\t\t\t\t<input type=\"date\" name=\"AfterDate\" id=\"AfterDate\" > \r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t<select id=\"status\" name=\"status\" hidden=\"\">\r\n");
      out.write("\t\t\t\t<option value=\"Y\">Y</option>\r\n");
      out.write("\t\t\t\t<option value=\"N\">N</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<select id=\"pcategory\" name=\"pcategory\" hidden=\"\">\r\n");
      out.write("\t\t\t\t<option value=\"100\">..</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<!-- 카테고리 테이블에있는 카테고리를 jsp를 통해 옵션값을 넣어준다. -->\r\n");
      out.write("\t\t\t<select id=\"constitution\" name=\"constitution\" hidden=\"\">\r\n");
      out.write("\t\t\t\t<option value=\"100\">수양</option>\r\n");
      out.write("\t\t\t\t<option value=\"200\">수음</option>\r\n");
      out.write("\t\t\t\t<option value=\"300\">목양</option>\r\n");
      out.write("\t\t\t\t<option value=\"400\">목음</option>\r\n");
      out.write("\t\t\t\t<option value=\"500\">금양</option>\r\n");
      out.write("\t\t\t\t<option value=\"600\">금음</option>\r\n");
      out.write("\t\t\t\t<option value=\"700\">토양</option>\r\n");
      out.write("\t\t\t\t<option value=\"800\">토음</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<select id=\"order\" name=\"order\">\r\n");
      out.write("\t\t\t\t<option value=\"asc\">오름차순</option>\r\n");
      out.write("\t\t\t\t<option value=\"desc\">내림차순</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"검색\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"tableArea\" align=\"center\">\r\n");
      out.write("\t\t<table style=\"width: 90%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"7%\" style=\"text-align: center;\">상품코드</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"7%\" style=\"text-align: center;\">등록일</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\" style=\"text-align: center;\">카테고리명</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"7%\" style=\"text-align: center;\">체질명</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"25%\" style=\"text-align: center;\">상품명</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"7%\" style=\"text-align: center;\">가격(원)</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\" style=\"text-align: center;\">이벤트</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\" style=\"text-align: center;\">할인율(%)</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"5%\" style=\"text-align: center;\">진열 상태</th>\t\t\r\n");
      out.write("\t\t\t\t\t<th width=\"9%\" style=\"text-align: center;\">입고/폐기</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: right;\">100</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: center;\">2018-03-04</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">반찬</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">토양</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\"><a href=\"");
      out.print( request.getContextPath());
      out.write("/views/admin/admin_productUpadate.jsp\">소세지야채볶음</a></td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: right;\">10,000</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\">New Hot Sale</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: right;\">10</td>\r\n");
      out.write("\t\t\t\t<td>Y</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div class=\"statusButton\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" style=\"font-size: 13px;\" onclick=\"warehousing();\">입고</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"statusButton\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" style=\"font-size: 13px;\" onclick=\"release();\">폐기</button>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<button class=\"resisterBt\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/views/admin/admin_productResister.jsp'\">상품 등록</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction selectSearch() {\r\n");
      out.write("\t\t\tvar selection = document.getElementById('searchCondition').value;\r\n");
      out.write("\t\t\tif(selection=='pcode'){\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='inline';\r\n");
      out.write("\t\t\t} if(selection=='pdate'){\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='inline';\r\n");
      out.write("\t\t\t} else if(selection=='pcategory') {\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='none';\r\n");
      out.write("\t\t\t} else if(selection=='constitution') {\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='none';\r\n");
      out.write("\t\t\t} else if(selection=='pname') {\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='inline';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchText').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('serachDate').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('status').style.display='inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('constitution').style.display='none';                        \r\n");
      out.write("\t\t\t\tdocument.getElementById('pcategory').style.display='none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('order').style.display='none';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction warehousing(){\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/views/admin/admin_warehousingResister.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction release(){\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/views/admin/admin_releaseResister.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</div>\r\n");
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