public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/* // Open a form ID.
var formulario = FormApp.openById('1kNqgT1_GpO0_XiGDFDoAq_7THusTWaZ0dzZfQzaVJbg')

// OBRA:        444497574   4.44497574E8
// CLIENTE:     2047541057  2.047541057E9
// ESCRITÓRIO:  588085303   5.88085303E8
// CONTATO:     761217687   7.61217687E8

// Open Sheets
var fornecendores = SpreadsheetApp.openById('1fGutfcsYxWVNIuVkvG5R6wosQ7Qjr5TUyXhoNdIKxb4').getSheetByName('FORNECEDORES')
var obras = SpreadsheetApp.openById('1fGutfcsYxWVNIuVkvG5R6wosQ7Qjr5TUyXhoNdIKxb4').getSheetByName('OBRAS')

function atualizacao(){
    // Fornecedores 
    var ultForc = fornecendores.getLastRow()
    var dados = fornecendores.getRange("B4:B" + ultForc).getValues()
    formulario.getItemById("588085303").asListItem().setChoiceValues(dados);
    
    // Obras - TRIGRAN
    var ultObra = obras.getLastRow()
    var dados = obras.getRange("B2:B" + ultObra).getValues()
    formulario.getItemById("444497574").asListItem().setChoiceValues(dados);
    
  } */