<%@ page isELIgnored="false" %>

<html>
<head>
    <title>X-workz</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>


<h1 style="color:red">${msg}</h1>

<h1 style="color:green">${msg1}</h1>
    <form class="row g-3" action="laptop" >
      <div class="bg-danger">


        <div class="col-md-6 mt-2">

          <input type="text" class="form-control" placeholder="Enter laptop name" name="name">
        </div>
        <div class="col-md-6 mt-2">

          <input type="number" class="form-control"  placeholder="Enter laptop price"  name="price">
        </div>

        <div class="col-12">
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
        </div>
      </form>

</body>
</html>
