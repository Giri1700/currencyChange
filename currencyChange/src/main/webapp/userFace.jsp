<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Currency</title>
<style>

body{
background-color:#A5ACB4;

}
.container{
width:400px;
height:600px;
border:7px solid #171F29;
border-radius:25px;
margin: auto;
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
#bt1{
	margin-top: 30px;
	width: 75px;
	margin-left: 235px;
	padding: 10px;
	font-weight: bold;
	border-radius: 10px;
	box-shadow: 0 0px 10px #727578;
	cursor: pointer;
	border:none;
	background-color:#A5ACB4;
	color: white;
}
#bt1:hover {
	background-color: #052852;
	color: white;
	transition-duration: 1s;
	border: 2px solid white;
}
#reset{
	margin-top:-33px;
	width: 75px;
	margin-left: 25px;
	padding: 10px;
	font-weight: bold;
	border-radius: 10px;
	box-shadow: 0 0px 10px #727578;
	cursor: pointer;
	border:none;
	background-color:#A5ACB4;
	color: white;
	
}
#reset:hover{
	background-color: #052852;
	color: white;
	transition-duration: 1s;
	border: 2px solid white;
}
#a1{
color:white;
text-decoration:none;
}
img{
height:80px;
width:80px;
border-radius:50px;
position:relative;
bottom:600px;
right:-10px;
}
</style>
</head>
<body>



<div class="container">

<h1>Welcome to currency conversion </h1>

<form action="changing" method="post" >

<label>Enter Amount</label>
<input type="text" name="amt" value="${amount}">

<label>Currency From</label>
<select name="fromcurrency" >
<option >Choose...</option>
<option value="INR">Indian Rupee INR </option>
<option value="USD">United States USD</option>
<option value="ERU">European Euro EUR</option>
<option value="KWD">Kuwaiti Dinar KWD</option>
</select>

<label>Currency to</label>
<select name="tocurrency" >
<option >Choose...</option>
<option value="INR">Indian Rupee INR </option>
<option value="USD">United States USD</option>
<option value="ERU">European Euro EUR</option>
<option value="KWD">Kuwaiti Dinar KWD</option>	

</select>

<label>Amount After Conversion</label>
<input value="${amountExchanged}">

<button type="submit" id="bt1" class="btn btn-primary">Convert</button>

 <button  type="reset" id="reset"><a id="a1" href="userFace.jsp">Reset</a></button>


</form>


</div>

<img src="GG logo.png" alt="GG">

</body>
</html>

