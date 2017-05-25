<?php
function make_array(&$arr, $n) {
  for($i = 0; $i < $n; $i++) $arr[$i] = explode(' ', trim(fgets(STDIN)));
}
list($n, $m, $l) = explode(' ', trim(fgets(STDIN)));
make_array($a, $n);
make_array($b, $m);
for($i = 0; $i < $n; $i++)
  for($j = 0; $j < $l; $j++) {
    $c = 0;
    for($k = 0; $k < $m; $k++) $c += $a[$i][$k] * $b[$k][$j];
    echo $c.($j == $l-1? PHP_EOL:' ');
  }
