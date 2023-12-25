const prompt = require('prompt-sync')();

var raio = prompt("Qual o valor do raio do circulo? R:");
raio = parseFloat(raio);
//calcula a área do círculo usando a fórmula A = π * r²
var area = Math.PI*Math.pow(raio,2);

console.log("Área é igual a: "+area);