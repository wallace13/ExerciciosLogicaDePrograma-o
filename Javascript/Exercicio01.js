const prompt = require('prompt-sync')();

var numero = prompt("Digite um número: ");

numero = parseFloat(numero);

if (numero > 20) {
    console.log("Metade do número é :"+(numero/2));
} else {
    console.log("Número é : "+numero);
}