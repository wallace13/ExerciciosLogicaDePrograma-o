<?php

echo "Digite um número: ";

$numero = floatval(trim(fgets(STDIN)));

if ($numero > 20) {
    echo "Metade do número é: ".($numero/2);
} else {
    echo "Número é: ".$numero;
}

?>
