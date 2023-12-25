<?php

echo "Qual o valor do raio do circulo? R:";

$raio = floatval(trim(fgets(STDIN)));
//calcula a área do círculo usando a fórmula A = π * r²
$area = pi()*pow($raio,2);

echo "Área é igual a: {$area}";
?>
