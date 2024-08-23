
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>X-workz</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>


<h3 style="color:red">${msg}</h3>

    <form class="row g-3" action="detail">
      <div class="bg-danger">


        <div class="col-md-6 mt-2">

          <input type="text" class="form-control" placeholder="Enter your name" name="name">
        </div>
        <div class="col-md-6 mt-2">

          <input type="number" class="form-control"  placeholder="Enter your age"  name="age">
        </div>
        <div class="col-6 mt-2">

          <input type="password" class="form-control"  placeholder="Enter your password"  name="password">
        </div>

        <div class="col-12">
          <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
        </div>
      </form>

</body>
</html>
