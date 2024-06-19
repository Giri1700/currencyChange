<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
background-color:#A5ACB4;

}
.container{
width:400px;
height:600px;
border:7px solid #171F29;
border-radius:25px;
margin:auto;
position:relative;
top:80px;
box-shadow: 0 0px 16px #727578;
}
h1{
text-align:center;
color:white;
padding-top:20px;

}
form {
padding-top:5px;
display: flex;
flex-direction: column;
padding:20px;
}

label {
	padding: 8px;
	font-size:25px;
	color:white;
}

input {
	padding: 12px;
	border-radius: 20px;
	color:white;
	background-color:#171F29;
	border:none;
	outline:none;
	box-shadow: 0 0px 10px #727578;
}
select{
	padding: 12px;
	border-radius: 20px;
	color:white;
	background-color:#171F29;
	border:none;
	box-shadow: 0 0px 8px #727578;
}
button{
	margin-top: 30px;
	width: 75px;
	margin-left: 135px;
	padding: 10px;
	font-weight: bold;
	border-radius: 10px;
	box-shadow: 0 0px 10px #727578;
	cursor: pointer;
	border:none;
	background-color:#171F29;
	color: white;
}
button:hover {
	background-color: #052852;
	color: white;
	transition-duration: 1s;
	border: 2px solid white;
}

</style>
</head>
<body>

<div class="container">

<h1>Welcome to currency conversion </h1>

<form action="changing" method="post">

<label>Enter Amount</label>
<input type="text" name="amt">

<label>Currency From</label>
<select name="fromcurrency">
<option value="INR">IND</option>
<option value="USD">USD</option>
</select>

<label>Currency to</label>
<select name="tocurrency">
<option value="INR">IND</option>
<option value="USD">USD</option>
</select>

<label>Amount After Conversion</label>
<input value="${amountExchanged}">

<button type="submit" class="btn btn-primary">Convert</button>

 <button id="b1" type="button"><i class="fa fa-home"> </i>&nbsp;&nbsp;<a id="a1" href="userFace.jsp">&lt;&lt;&nbsp;Go Home</a></button>


</form>
</div>
</body>
</html>