<?php

echo "Qual o valor do Cateto Adjacente? R:";
$cateto1 = floatval(trim(fgets(STDIN)));

echo "Qual o valor do Cateto Oposto a Hipotenusa? R:";
$cateto2 = floatval(trim(fgets(STDIN)));

$hipotenusa = sqrt(pow($cateto1, 2)+pow($cateto2, 2));

echo "Hipotenusa: {$hipotenusa}";

?>
