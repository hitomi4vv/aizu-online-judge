<?php
$input_lines = fgets(STDIN);

$abc = explode(' ', $input_lines);
$a = $abc[0];
$b = $abc[1];
$c = $abc[2];

if ($a < $b && $b < $c) {
  echo 'Yes';
} else {
  echo 'No';
}
?>
