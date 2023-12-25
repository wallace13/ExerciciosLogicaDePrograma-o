const prompt = require('prompt-sync')();

var numero = prompt("Digite um número:");
numero = parseFloat(numero);

console.log("A) "+numero);
console.log("B) "+Math.pow(numero, 2));
console.log("c) "+Math.sqrt(numero));