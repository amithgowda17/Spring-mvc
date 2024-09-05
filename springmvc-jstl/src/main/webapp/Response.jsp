<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false" %>

<html>
<head>
    <title>X-workz</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>


    <form class="row g-3" >


    <c:forEach items="${error}" var="errs">
    			<p> ${errs}</p>
    		</c:forEach>


      <div class="bg-danger">


        <div class="col-md-6 mt-2">

          <input type="text" class="form-control" placeholder="Enter chocolate name" name="name">
        </div>
        <div class="col-md-6 mt-2">

          <input type="number" class="form-control"  placeholder="Enter chocolate price"  name="price">
        </div>
        <div class="col-6 mt-2">

          <input type="number" class="form-control"  placeholder="Enter chocolate quantity"  name="quantity">
        </div>

        <div class="col-12">
          <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
        </div>
      </form>

</body>
</html>
