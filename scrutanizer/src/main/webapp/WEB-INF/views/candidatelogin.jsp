<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome!</title>
 <link href="<c:url value="/resources/css/home_style.css" />" rel="stylesheet">
</head>

<body>
<header>
  <nav class="nav" id="navigation">
    <table id="nav_table" width="200" border="0" >
      <tbody>
        <tr>
        <td><a href="../">
            <button>
            <pre>home</pre>
            </button>
            </a></td>
          <td><a href="../navigation/adminLogin">
            <button>
            <pre>Admin Login</pre>
            </button>
            </a></td>
          <td><a href="../navigation/aboutUs">
            <button>
            <pre>About Us</pre>
            </button>
            </a></td>
        </tr>
      </tbody>
    </table>
  </nav>
</header>
<img id="logo" src="<c:url value="/resources/images/logo.png" />" width="100" height="100" alt=""/>
<h1 id="companyname"><strong>Scrutinize</strong></h1>
<h6 id="tagline">Your skill scale partner!</h6>
<section class = "container">
  <div>
	 <form:form action="loginUser" method="post" modelAttribute="user">
    <h2 id="heading">Candidate Login</h2>
				<form:input path="email" placeholder="Email" class="inputField"/><br><br>
				<form:password path="password" placeholder="Password" class="inputField"/>
    <br>
    <a style="color: white" href="../candidate/showForm">New to Scrutinize? Register Now!</a><br>
    <input type="submit" name="submit" id="submit" value="Submit"/>
    </form:form>
    <div style="color: red">${error}</div>
  </div>
</section>
</body>
</html>
