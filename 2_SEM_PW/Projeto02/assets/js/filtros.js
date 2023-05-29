function filtrarStatus(tipo){
	let tafefasFiltradas = tafefas.filter(tafefa => tafefa.status == tipo);
	filtrar(tafefasFiltradas);
}

document.querySelector('#buscar').addEventListener('keyup', function () {
	let tafefasFiltradas = tafefas.filter(tafefa => tafefa.nome.toUpperCase().includes(this.value.toUpperCase()));
	filtrar(tafefasFiltradas);
});