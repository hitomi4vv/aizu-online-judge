<?php
$input_lines = fgets(STDIN);
$ab = explode(' ', $input_lines);
$a = $ab[0];
$b = $ab[1];
echo $a * $b , ' ', ($a+$b) * 2;
?>
