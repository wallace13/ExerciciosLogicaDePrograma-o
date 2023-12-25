<?php
//cria array (indiceInicial,tamanhoArray,ValorPadrão)
$valores = array_fill(0, 5, 0);
$soma = 0;
for ($i=0; $i < sizeof($valores) ; $i++) { 
    echo "Informe um valor: ";
    $numero = floatval(trim(fgets(STDIN))); 
    $valores[$i] = $numero;
    $soma = $soma + $valores[$i];
}
echo "\nSoma: {$soma}";

?>
