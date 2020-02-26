<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
</head>
<script type="text/javascript">
</script>
<body>
	<form action="list.do" method="post">
		品牌<input type="text" name="name" value="${name }"><br> 价格<input
			type="text" name="p1" value="${p1 }">- <input type="text"
			name="p2" value="${p2 }">
		<button type="submit">查询</button>
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>类型</td>
			<td>尺寸</td>
			<td>数量</td>
			<td>单价</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="c">

			<tr>
				<td>${c.id}</td>
				
				<td>${c.name}</td>

				<td>${c.lei}</td>

				<td>${c.chi}</td>

				<td>${c.shu}</td>

				<td>${c.dan}</td>

				
				<td><a href="add">添加</a></td>
			</tr>
		</c:forEach>
		<tr>
		<td colspan="100">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
			<button onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})">下一页</button>
			<button onclick="fenye(${page.pages})">尾页</button>
			当前${page.pageNum}/${page.pages}页,一共${page.total}条
		</td>
	</tr>
	</table>
</body>
</html>