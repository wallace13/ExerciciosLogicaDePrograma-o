<?php

echo "Digite um número: ";

$numero = floatval(trim(fgets(STDIN)));

switch ($numero % 10) {
case 0:
    echo "{$numero} é Múltiplo de 10";
    break;
default:
    echo "{$numero} O número Digitado Não é Multiplo de 10";
}

?>
