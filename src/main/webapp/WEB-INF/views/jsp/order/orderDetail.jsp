<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href='${pageContext.request.getContextPath()}/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />
<script type="text/javascript" src="${pageContext.request.getContextPath()}/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC</title>
<style>
    .nav{background-color:black;}
    .nav .nav-item a{color:white;}
    .container {
        width: 900px;
        margin: 0 auto;
    }

</style>
</head>
<body>
<header>
  <div class="container">
    <ul class="nav" style="margin-top:10px"; >
        <li class="nav-item">
                  <a class="nav-link active" href="/">Home</a>
        </li>
        <li class="nav-item">
                  <a class="nav-link" href="/addOrder">Add Order</a>
        </li>

    </ul>
  </div>
</header>
<nav>
  <div class="container" style="margin-top:10px">
    <mvc:form  action="search" method ="get">
        <div class="row">
          <div class="col"><input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="searchInput"></div>
          <div class="col"><button class="btn btn-outline-success" type="submit">Search</button></div>
        </div>
      </mvc:form>
  </div>
</nav>
<main>
  <div class="container">
      <h2>List All Order</h2>
      <table class="table">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th>OrderDate</th>
              <th>Customer Name</th>
              <th>View Detail</th>
            </tr>
          </thead>
          <tbody>
                <c:forEach items="${orderList}" var="orderList">
                     <tr>
                       <th scope="row" >${orderList.id}</th>
                       <th>${orderList.orderDate}</th>
                       <th>${orderList.customerName}</th>
                       <th><a class="btn btn-primary" href="#" role="button">View Detail</a>
                       </th>
                     </tr>
                </c:forEach>
          </tbody>
        </table>
    </div>
</main>
</body>
</html>