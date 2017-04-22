<?php
list($n, $m) = explode(' ', trim(fgets(STDIN)));
for($i = 0; $i < $n; $i++) $a[$i] = explode(' ', trim(fgets(STDIN)));
for($j = 0; $j < $m; $j++) $b[] = fgets(STDIN);
for($i = 0; $i < $n; $i++) {
  $sum = 0;
  for($j = 0; $j < $m; $j++) $sum += $a[$i][$j] * $b[$j];
  echo $sum.PHP_EOL;
}
