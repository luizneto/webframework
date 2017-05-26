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
							<td>${contato.nome}</td>
							<th>Sobrenome</th>
							<td>${contato.sobreNome}</td>				
							<th>Telefone</th>
							<td>${contato.telefone}</td>
							<th>Email</th>
							<td>${contato.email}</td>
							<th>Idade</th>
							<td>${contato.idade}</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="panel-footer">
			<input class="btn btn-sm btn-success" value="update" >Atualizar</a>
			<a class="btn btn-sm btn-danger" th:href="/homecontato" >Cancelar</a>
		</div>
	</div>
</body>
</html>