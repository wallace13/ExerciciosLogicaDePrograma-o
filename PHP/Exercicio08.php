<?php

echo "Digite um número: ";

$numero = floatval(trim(fgets(STDIN)));

echo "A) {$numero}\n";
$quadrado = pow($numero, 2);
echo "B) {$quadrado}\n";
$raiz = sqrt($numero);
echo "C) {$raiz}\n";

?>
