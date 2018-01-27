<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %> 
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<title>Emergencias App Login Page</title>
		
	</head>
	<body>
	    <div id="box-login">
			<form name="loginUser" id="login-user" action="login" method="POST" name="userView">
				<table id="login-user-table">
					<tr>
						<td colspan="2" align="center"><h4 style="font-weight: bold; color: red;"><s:message code="${userView.mensajeError}" text="" /></h4></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><p id="login-info">LOGIN:</p></td>
					</tr>
					<tr>
						<td align="right"><label for="user">User:</label></td>
						<td><input type="text" name="user" value="" class="" ></td>
					</tr>
					<tr>
						<td align="right"><label for="pass">Pass:</label></td>
						<td><input type="password" name="pass" class=""  /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input  name="submit" type="submit" class="" value="Submit"/></td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
