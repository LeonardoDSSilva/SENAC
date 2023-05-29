
document.querySelector('#btn_Salvar').addEventListener('click', inserir);
document.querySelector('#btn_Cards').addEventListener('click', modoCards);
document.querySelector('#btn_Table').addEventListener('click', modoTable);


function modoCards() {
	document.querySelector('#tabela').innerHTML = '';
	document.querySelector('#md_Cards').innerHTML = '';
	document.querySelector('#md_Table').style.visibility = 'hidden';
	tafefas.forEach(tafefa => document.querySelector('#md_Cards').innerHTML += criarCard(tafefa));
}

function modoTable() {
	document.querySelector('#tabela').innerHTML = '';
	document.querySelector('#md_Cards').innerHTML = '';
	document.querySelector('#md_Table').style.visibility = 'visible';
	tafefas.forEach(tafefa => document.querySelector('#tabela').innerHTML += criaLinha(tafefa));
}

let tafefas = [];

window.addEventListener('load', () => {
	tafefas = JSON.parse(localStorage.getItem('tafefas')) || [];
	atualizar();
});

function atualizar() {
	document.querySelector('#tabela').innerHTML = '';
	tafefas.forEach(tafefa => document.querySelector('#tabela').innerHTML += criaLinha(tafefa));

	qntNaoIniciado = tafefas.filter(tafefa => tafefa.status == 0).length;
	qntIniciado = tafefas.filter(tafefa => tafefa.status == 1).length;
	qntEmAndamento = tafefas.filter(tafefa => tafefa.status == 2).length;
	qntConcluido = tafefas.filter(tafefa => tafefa.status == 3).length;
	qntTotal = tafefas.length;

	document.querySelector('#qntNaoIniciado').innerHTML = qntNaoIniciado;
	document.querySelector('#qntIniciado').innerHTML = qntIniciado;
	document.querySelector('#qntEmAndamento').innerHTML = qntEmAndamento;
	document.querySelector('#qntConcluido').innerHTML = qntConcluido;

	document.querySelector('#qntTotal').innerHTML = tafefas.length;
};

var myCollapse = document.getElementById('collapseExample')
var bsCollapse = new bootstrap.Collapse(myCollapse, {
  toggle: false
})


function inserir() {

	const nome = document.querySelector('#nome').value;
	const disciplina = document.querySelector('#disciplina').value;
	const valor = document.querySelector('#valor').value;

	const qtdLinhas = document.querySelector('#tabela').rows.length + 1;

	const tafefa = {
		linha: qtdLinhas,
		id: Date.now(),
		nome,
		disciplina,
		valor,
		status: 0
	}

	if (!isValid(tafefa.nome, document.querySelector("#nome"))) return
	if (!isValid(tafefa.disciplina, document.querySelector("#disciplina"))) return
	if (!isValid(tafefa.valor, document.querySelector("#valor"))) return

	tafefas.push(tafefa);
	localStorage.setItem('tafefas', JSON.stringify(tafefas));
	document.querySelector('#tabela').innerHTML += criaLinha(tafefa);
	atualizar();

	//Limpa os campos
	document.querySelector('#nome').value = '';
	document.querySelector('#disciplina').value = 'Escolha uma disciplina...';
	document.querySelector('#valor').value = '';

	//Remove a classe is-valid
	document.querySelector("#nome").classList.remove("is-valid")
	document.querySelector("#disciplina").classList.remove("is-valid")
	document.querySelector("#valor").classList.remove("is-valid")

	//Fecha collapse
	// bsCollapse.hide()

};


function apagar(botao) {

	// Deleta do localStorage
	const id = botao.parentNode.parentNode.querySelector('th').textContent;
	const index = tafefas.findIndex(tafefa => tafefa.id == id);
	tafefas.splice(index, 1);
	localStorage.setItem('tafefas', JSON.stringify(tafefas));

	// Deleta da tabela
	botao.parentNode.parentNode.remove();
	window.alert('Apagado com sucesso!');
}

function criaLinha(tafefa) {
	const linha =

		`
	<tr>
	<th scope="row">${tafefa.linha}</th>
		<td>${tafefa.nome}</td>
		<td>${tafefa.disciplina}</td>
		<td>${tafefa.valor}</td>
		<td>
			<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="success-outlined-${tafefa.id}" autocomplete="off" ${tafefa.status == 1 ? 'checked' : ''}>
			<label class="btn btn-outline-success" for="success-outlined-${tafefa.id}" onClick="status(${tafefa.id}, 1)">Iniciado</label>
				
			<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="warning-outlined-${tafefa.id}" autocomplete="off" ${tafefa.status == 2 ? 'checked' : ''}>
			<label class="btn btn-outline-warning" for="warning-outlined-${tafefa.id}" onClick="status(${tafefa.id}, 2)">Em Andamento</label>
				
			<input type="radio" class="btn-check" name="options-outlined-${tafefa.id}" id="danger-outlined-${tafefa.id}" autocomplete="off"  onChange="status(${tafefa.id}, 3)" ${tafefa.status == 3 ? 'checked' : ''}>
			<label class="btn btn-outline-danger" for="danger-outlined-${tafefa.id}" >Concluído</label>

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

	// window.alert('Nome: ' + nome + ' Disciplina: ' + disciplina + ' Valor: ' + valor);


	document.querySelector('#nomeED').value = nome;
	document.querySelector('#disciplinaED').value = disciplina;
	document.querySelector('#valorED').value = valor;

}

function validar(input) {
	const tipoDeInput = input.id;
	const valorInput = input.value;

	if (valorInput == '') {
		window.alert('Preencha o campo ' + tipoDeInput);
	}
};

function isValid(valor, campo) {
	if (valor.length == 0 || valor == "Escolha uma disciplina...") {
		campo.classList.add("is-invalid")
		campo.classList.remove("is-valid")
		return false
	} else {
		campo.classList.add("is-valid")
		campo.classList.remove("is-invalid")
		return true
	}
};

function criarCard(tarefa) {
	const card = `
		<div class="col-lg-3 col-md-6 col-sm-12">
		<div class="card">
			<div class="card-header">
				${tarefa.nome}
			</div>
			<div class="card-body">
				<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
				<p class="card-text">${tarefa.disciplina}</p>
				<span class="badge text-bg-warning">${tarefa.valor}pt</span>
			</div>
			<div class="card-footer">
				<a href="#" class="btn btn-success" title="marcar como concluída">
					<i class="bi bi-check2"></i>
				</a>
				<a href="#" onClick="apagar(this)" class="btn btn-danger" title="apagar tarefa">
					<i class="bi bi-trash3"></i>
				</a>
			</div> <!-- card footer -->
		</div> <!-- card -->
	</div> <!-- col -->
	` 
	return card
}

function status(id, status) {
	const index = tafefas.findIndex(tafefa => tafefa.id == id);
	tafefas[index].status = status;
	localStorage.setItem('tafefas', JSON.stringify(tafefas));
	atualizar();
}

function filtrar(lista){
	document.querySelector('#tabela').innerHTML = ''
	lista.forEach(tafefa => document.querySelector('#tabela').innerHTML += criaLinha(tafefa))
}