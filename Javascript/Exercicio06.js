const prompt = require('prompt-sync')();

var valores = new Array(5);
var soma = 0;

for (let i = 0; i < valores.length; i++) {
    numero = prompt("Informe um valor: ");
    valores[i] = parseFloat(numero);
    soma = soma + valores[i];
}
console.log("\nSoma: "+soma);
