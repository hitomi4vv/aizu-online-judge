<?php
$input_lines = fgets(STDIN);

$abc = explode(' ', trim($input_lines));
sort($abc);

echo implode(' ', $abc);
?>
