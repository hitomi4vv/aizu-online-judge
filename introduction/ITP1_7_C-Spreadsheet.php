<?php
list($r, $c) = explode(' ', trim(fgets(STDIN)));
$sum = array_fill(0, $c, 0);
for($i = 0; $i < $r; $i++) {
  $line = trim(fgets(STDIN));
  $arr = explode(' ', $line);
  echo $line.' '.array_sum($arr).PHP_EOL;
  foreach($arr as $j => $v) $sum[$j] += $v;
}
echo implode(' ', $sum).' '.array_sum($sum).PHP_EOL;
