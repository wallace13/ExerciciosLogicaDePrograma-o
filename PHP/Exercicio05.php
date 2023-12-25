<?php
echo "Codigo - Opção\n";
echo "1 - Incluir\n2 - Alterar\n3 - Excluir\n4 - Pesquisar\n5 - Sair\n";

echo "Informe o número do seu codigo: ";

$codigo = floatval(trim(fgets(STDIN)));

switch ($codigo) {
case 1:
    echo("Incluir");
    break;
case 2:
    echo("Alterar");
    break;
case 3:
    echo("Excluir");
    break;
case 4:
    echo("Pesquisar");
    break;
case 5:
    echo("Sair");
    break;
default:
    echo("Opção não existe no Menu");
}
?>
