<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page isELIgnored="false" %>

<html>
<head>
    <title>X-workz</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>


  <h3 style="color: red;">${errmsg}</h3>
  <h3 style="color: green;">${success}</h3>

    <form class="row g-3" action="save" method="post">
      <div class="bg-danger">


        <div class="col-md-6 mt-2">

          <input type="text" class="form-control" placeholder="Enter trainee name" name="name" >
        </div>
        <div class="col-md-6 mt-2">

          <input type="email" class="form-control"  placeholder="Enter trainee email"  name="email">
        </div>
        <div class="col-6 mt-2">

        <div class="col-12">
          <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
        </div>
      </form>
<div>

  <a href="getDetails">Show Trainees</a>

</div>
      

</body>
</html>

