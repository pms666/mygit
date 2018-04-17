<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id="input" name=form1
		action="${pageContext.request.contextPath }/AddStudentServlet"
		method="post">
		

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：评价管理 &gt; 添加评价</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  <h3>请您对框架进行评价</h3>
  						<input type="radio" name="name" value="掌握" checked="checked" />
  						掌握
  						<input type="radio" name="name" value="有点印象" /> 
  						有点印象
  						<input type="radio" name="name" value="不太明白" /> 
  						不太明白
  						<input type="radio" name="name" value="不感兴趣" /> 
  						不感兴趣
  						<input type="radio" name="name" value="需要看视频才能看懂" />  
  						需要看视频才能看懂
			
							<TR>
								<td>学生姓名：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_name">
								</td>
								<td>学生学号 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_level">
								</td>
							</TR>
							
							<TR>
								
								<td>班级 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_source">
								</td>
								<td>联系人：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_linkman">
								</td>
							</TR>
							
							<TR>
								
								
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_phone">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_mobile">
								</td>
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
	<script type="text/javascript">
	 // $(function(){
	 //    	/** 部门表单提交 */
		// 	$("#addForm").click(function(){
		// 		var name = $("#name1");
		// 		var msg = "";
		// 		if ($.trim(name.val()) == ""){
		// 			msg = "名称不能为空！";
		// 			name.focus();
		// 		}
				
		// 		if (msg != ""){
		// 			$.ligerDialog.error(msg);
		// 			return false;
		// 		}else{
		// 			return true;
		// 		}
		// 		$.post("${pageContext.request.contextPath}/evaluate/add.do", 
		// 				$("#addForm").serialize(), function (data){
		// 			if (data =="OK"){
		// 				alert("职位成功");
		// 			/* 	window.location.href:"${pageContext.request.contextPath}/dept/queryDept.do"; */
		// 			}else{
		// 				alert("失败")
		// 				window.location.reload();
		// 			}
		// 		});
		// 	});
	 //    });
		
	
		var Oinput = document.getElementById("input");
		var OBC = document.getElementById("SUBMIT");

		OBC.onclick =function (){

			var obj = Oinput.getElementsByTagName("input");
		    for(var i=0; i<obj.length; i ++){
		        if(obj[i].checked){
		           //alert(obj[i].value);
		           var OPJ = obj[i].value;
		           
		        }
		       
		     //alert(obj[i].value);    
			}
			
			alert(OPJ);
			// if(OPJ == "undefined"){
		 //           //alert(obj[i].value);
		 //          alert("失败");
		           
		 //        }
		}
		 
		 
	
	</script>
</HTML>
