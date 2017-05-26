<!DOCTYPE html>

<head>
	<meta charset="UTF-8" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width" />
	<title>Posts</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"></link>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<strong>Posts</strong>
		</div>
		<div class="panel-body">
			<div class="table-responsive">
				<table class="table table-sm table-striped table-hover table-bordered">
					<thead>
						<tr>
							<th>Nome</th>
							<th>Sobrenome</th>
							<th>Telefone</th>
							<th>Email</th>
							<th>Idade</th>
							<th>Ações</th>
					</tr>
					</thead>
					<tbody>
						<tr >
							<td>${nome}</td>
							<td>${sobreNome}</td>											
							<td>${telefone}</td>
							<td>${email}</td>
							<td>${idade}</td>
							<td><div class="panel-footer">
								<a class="btn btn-sm btn-success" th:href="/homecontato/delete${contato.id}" >Remover</a>
								<a class="btn btn-sm btn-success" th:href="/homecontato/update${contato.id}" >Editar</a>
								<a class="btn btn-sm btn-success" th:href="/homecontato/consultar${contato.id}" >Consultar</a>
								</div>
							</td> 
														
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="panel-footer">
			<a class="btn btn-sm btn-success" href="/novocontato.jsp" >Novo Contato</a>
		</div>
	</div>
</body>
</html>