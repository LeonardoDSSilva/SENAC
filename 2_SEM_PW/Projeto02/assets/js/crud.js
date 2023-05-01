
document.querySelector('#btn_Salvar').addEventListener('click', inserir);

function inserir() {

	const nome = document.querySelector('#nome').value;
	const disciplina = document.querySelector('#disciplina').value;
	const valor = document.querySelector('#valor').value;

	const qtdLinhas = document.querySelector('#tabela').rows.length + 1;

	const tafefa = {
		id: qtdLinhas,
		nome,
		disciplina,
		valor
	}

	document.querySelector('#tabela').innerHTML +=  criaLinha(tafefa);
	// window.alert('Inserido com sucesso! \n	Nome: ' + nome + ' Disciplina: ' + disciplina + ' Valor: ' + valor);
	
}

function apagar(botao) {
	botao.parentNode.parentNode.remove();
	window.alert('Apagado com sucesso!');
}

function criaLinha(tafefa) {
	const linha =
	
	`
	<tr>
	<th scope="row">${tafefa.id}</th>
		<td>${tafefa.nome}</td>
		<td>${tafefa.disciplina}</td>
		<td>${tafefa.valor}</td>
		<td>
			<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="success-outlined-${tafefa.id}"
			autocomplete="off" checked>
				<label class="btn btn-outline-success" for="success-outlined-${tafefa.id}">Iniciado</label>
				
				<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="warning-outlined-${tafefa.id}"
				autocomplete="off">
				<label class="btn btn-outline-warning" for="warning-outlined-${tafefa.id}">Em Andamento</label>
				
				<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="danger-outlined-${tafefa.id}"
				autocomplete="off">
				<label class="btn btn-outline-danger" for="danger-outlined-${tafefa.id}">Concluído</label>
				</td>
				<td>
				<button type="button" onClick="carregar(this)"class="btn btn-primary" data-bs-toggle="modal"
				data-bs-target="#exampleModal">
				Editar
				</button>
				<button type="button" onClick="apagar(this)" class="btn btn-danger">Excluir</button>
				</td>
	</tr>
	`
	return linha;
}

function carregar(botao) {
	const linha = botao.parentNode.parentNode;
	const colunas = linha.querySelectorAll('td');
	
	const nome = colunas[0].textContent;
	const disciplina = colunas[1].textContent;
	const valor = colunas[2].textContent;
	
	window.alert('Nome: ' + nome + ' Disciplina: ' + disciplina + ' Valor: ' + valor);


	document.querySelector('#nomeED').value = nome;
	document.querySelector('#disciplinaED').value = disciplina;
	document.querySelector('#valorED').value = valor;
	
}