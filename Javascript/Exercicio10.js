const prompt = require('prompt-sync')();

var numero = prompt("Digite um número: ");

numero = parseFloat(numero);

switch (numero % 10) {
case 0:
    console.log(numero+" é Múltiplo de 10");
    break;
default:
    console.log(numero+" O número Digitado Não é Multiplo de 10");
}