<?php
$n = trim(fgets(STDIN));
$x = explode(' ',trim(fgets(STDIN)));
$y = explode(' ',trim(fgets(STDIN)));
$d = $d1 = $d2 = $d3 = $max = 0;
for($i = 0; $i < $n; $i++) {
  $d = abs($x[$i]-$y[$i]);
  $d1 += $d;
  $d2 += $d * $d;
  $d3 += $d * $d * $d;
  if($max < $d) $max = $d;
}
echo $d1.PHP_EOL.sqrt($d2).PHP_EOL.pow($d3, 1/3.0).PHP_EOL.$max;
