<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<form:form method="post" modelAttribute="userForm" action="${userActionUrl}">
		<form:input path="name" type="text" /> <!-- bind to user.name-->
		<form:errors path="name" />
	</form:form>
	
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Vertical (basic) form</h2>
  <form action="/contato/incluir" action="post">

    <div class="form-group">
      <label for="nome">Nome:</label>
      <input type="text" class="form-control" id="nome" placeholder="Enter nome" name="nome">
    </div>
    <div class="form-group">
      <label for="sobreNome">Sobrenome:</label>
      <input type="text" class="form-control" id="sobreNome" placeholder="Enter sobreNome" name="sobreNome">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="telefone">Telefone:</label>
      <input type="text" class="form-control" id="telefone" placeholder="(XX) x xxxx-xxxx" name="telefone">
    </div>
    <div class="form-group">
      <label for="idade">Idade:</label>
      <input type="number" class="form-control" id="text" placeholder="Enter idade" name="idade">
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
  </form>
</div>

</body>
</html>
