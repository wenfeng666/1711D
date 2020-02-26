<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function tj() {
		var zhi = $("#t1").serialize();
		$.ajax({
			url : "add.do",
			data : zhi,
			type : "post",
			dataType : "json",
			success : function(b) {
				if (b) {
					alert("添加成功");
					location.href = "list.do";
				} else {
					alert("添加失败");
				}
			}
		})
	}
</script>
</head>
<body>
	<form id="t1">
		<table>
			<tr>
				<td>名称</td>
				<td>
				
				<input type="checkbox" name="name" value="宝马">宝马
				<input type="checkbox" name="name" value="奔驰">奔驰
				<input type="checkbox" name="name" value="大众">大众
				<input type="checkbox" name="name" value="丰田">丰田
				<input type="checkbox" name="name" value="本田">本田
				<input type="checkbox" name="name" value="华为">宝马
				<input type="checkbox" name="name" value="小米">小米
				<input type="checkbox" name="name" value="红米">红米
				<input type="checkbox" name="name" value="苹果">苹果
				<input type="checkbox" name="name" value="小辣椒">小辣椒
				</td>
			</tr>



			<tr>
				<td>类型</td>
				<td>
				<input type="radio" name="lei" value="汽车">汽车
				
				<input type="radio" name="lei" value="手机">手机
				
				</td>
			</tr>

			<tr>
				<td>尺寸</td>
				<td><input type="text" name="chi"></td>
			</tr>



			<tr>
				<td>数量</td>
				<td><input type="text" name="shu"></td>
			</tr>




			<tr>
				<td>单价</td>
				<td><input type="text" name="dan"></td>
			</tr>




			<tr>
				<td></td>
				<td><input type="button" onclick="tj()" value="添加"></td>
			</tr>

		</table>
	</form>
</body>
</html>