const prompt = require('prompt-sync')();

var cateto1 = prompt("Qual o valor do Cateto Adjacente? R:");
cateto1 = parseFloat(cateto1);
var cateto2 = prompt("Qual o valor do Cateto Oposto a Hipotenusa? R:");
cateto2 = parseFloat(cateto2);

hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));

console.log("Hipotenusa: "+hipotenusa);