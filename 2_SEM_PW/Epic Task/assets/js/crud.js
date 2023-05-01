document.querySelector('#btn_Salvar').addEventListener('click', cadastrar)

function cadastrar() {
	const titulo = document.querySelector('#titulo').value
	const pontos = document.querySelector('#pontos').value
	const categoria = document.querySelector('#categoria').value

	// Criar um objeto
	const tarefa = {
		titulo,
		pontos,
		categoria
	}

	document.querySelector('#tarefas').innerHTML += criarCard(tarefa)

	// Limpar os campos
	document.querySelector('#titulo').value = ''
	document.querySelector('#pontos').value = ''
	document.querySelector('#categoria').value = ''

	// Fechar a janela modal
	
}

function apagar(botao){
    botao.parentNode.parentNode.parentNode.remove()
}

function criarCard(tarefa) {
    const card = `
        <div class="col-lg-3 col-md-6 col-sm-12">
        <div class="card">
            <div class="card-header">
                ${tarefa.titulo}
            </div>
            <div class="card-body">
                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                <p class="card-text">${tarefa.categoria}</p>
                <span class="badge text-bg-warning">${tarefa.pontos}pt</span>
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