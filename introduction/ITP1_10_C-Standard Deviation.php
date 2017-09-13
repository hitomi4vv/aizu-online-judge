<?php
while(($n = trim(fgets(STDIN))) != '0') {
  $s = explode(' ',trim(fgets(STDIN)));
  $m = array_sum($s)/$n;
  echo sqrt(array_sum(array_map(function($i) use ($m){return pow($i-$m, 2);}, $s))/$n).PHP_EOL;
}
