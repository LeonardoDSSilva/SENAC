
// Manipulação do DOM
var inputQtde = document.querySelector('#qtde')
inputQtde.addEventListener("change", atualizarOrcamento)
document.querySelector('#js').addEventListener("change", atualizarOrcamento)
document.querySelector('#layout_sim').addEventListener("change", atualizarOrcamento)
document.querySelector('#layout_nao').addEventListener("change", atualizarOrcamento)
document.querySelector('#prazo').addEventListener("change", atualizarOrcamento)

function atualizarOrcamento(){
    let qtde = inputQtde.value 
    let preco = qtde * 100
    
    let js = document.querySelector('#js').checked
    if(js) preco *= 1.1

    let layout = document.querySelector("#layout_sim").checked
    if(layout) preco *= 1 + (qtde * .1)

    let prazo = document.querySelector("#prazo").value
    let labelPrazo = document.querySelector("label[for=prazo]")
    labelPrazo.innerHTML = `Prazo (${prazo} semanas)` //template litereal
    preco *= 1 - (prazo * .01);

    let output = document.querySelector('#secao-orcamento form output')
    output.innerHTML = "R$ " + preco.toFixed(2)

}