<?php
$input_lines = fgets(STDIN);
list($a, $b) = explode(' ', trim($input_lines));
printf('%d %d %f', $a/$b, $a%$b, $a/$b);
?>
