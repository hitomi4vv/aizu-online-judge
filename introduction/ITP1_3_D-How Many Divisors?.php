<?php
$input_lines = fgets(STDIN);

list($a, $b, $c) = explode(' ', trim($input_lines));
$count = 0;
for ($i = $a; $i <= $b; $i++) {
  if ($c % $i == 0) {
    $count++;
  }
}

echo $count;
?>
