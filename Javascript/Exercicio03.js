const prompt = require('prompt-sync')();

var b = prompt("Digite um Número para a Base: ");
var e = prompt("Digite um Número para o Expoente: ");
var i = 0;
var x = 1;

if (e == 0) {
    x = 1;
} else {
   do{
        i++;
        x = x*b;
    }	while(i < e); 
}

console.log(b+" Elevado à "+ e + " = "  + x );
