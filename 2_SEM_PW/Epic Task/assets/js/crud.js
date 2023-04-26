document.querySelector('#btn_Salvar').addEventListener('click', cadastrar)

function cadastrar() {
	const titulo = document.querySelector('#titulo').value
	const pontos = document.querySelector('#pontos').value
	const categoria = document.querySelector('#categoria').value
	console.log('Cadastrando...')
	console.log(titulo, pontos, categoria)
}

function criarCard(){
	const card = `
	<div class="card col-lg-3 col-md-6 col-sm-12">
	<div class="card-header">
		Estudat o JS
	</div>
	<div class="card-body">
		<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
		<p class="card-text">Estudo</p>
		<span class="badge text-bg-warning">150pts</span>
	</div>
	<div class="card-footer">
		<a href="#" class="btn btn-success" title="marcar como concluida">
			<i class="bi bi-check2-square"></i>
		</a>
		<a href="#" class="btn btn-danger" title="remover tarefa">
			<i class="bi bi-trash3"></i>
		</a>

	</div>

	` // Template literals
}