const prompt = require('prompt-sync')();
console.log("Codigo - Opção");
console.log("1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Pesquisar\n5 - Sair");

var codigo = prompt("Informe o número do seu codigo: ");

switch (parseFloat(codigo)) {
case 1:
    console.log("Incluir");
    break;
case 2:
    console.log("Alterar");
    break;
case 3:
    console.log("Excluir");
    break;
case 4:
    console.log("Pesquisar");
    break;
case 5:
    console.log("Sair");
    break;
default:
    console.log("Opção não existe no Menu");
}