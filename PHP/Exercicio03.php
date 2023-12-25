<?php
echo "Digite um Número para a Base: ";
$b = floatval(trim(fgets(STDIN)));
echo "Digite um Número para o Expoente: ";
$e = floatval(trim(fgets(STDIN)));
$i = 0;
$x = 1;

if ($e == 0) {
    $x = 1;
} else {
   do{
        $i++;
        $x = $x*$b;
    }	while($i < $e); 
}
echo "{$b} Elevado à {$e} = {$x}";
?>
