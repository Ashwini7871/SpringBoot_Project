<html>
<head>
<title>Login Form</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Welcome</h3><br> 
<form action="/login">
Name: <input type="text" name="username" placeholder="Username" pattern="[A-Za-z]{2,25}" title="please enter your valid name" required> <br>
Password: <input type="password" name="password"placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*+`~'=?\|\]\[\(\)\-<>/]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter and special character's, and at least 8 or more characters" required><br>
<button type="submit"> Login</button>
</form>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>