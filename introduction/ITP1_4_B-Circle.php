<?php
$input_lines = fgets(STDIN);
$r = trim($input_lines);
printf('%f %f', $r*$r*M_PI, 2*M_PI*$r);
?>
