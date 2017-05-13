<?php
while(strpos(($line = trim(fgets(STDIN))), '0 0') === false) {
  list($n, $x) = explode(' ', $line);
  $c = 0;
  for($i = 1; $i < $x/3; $i++) $c += intval(max(min($n, ($x-$i+1)/2) - max($i+1, $x-$i-$n), 0));
  echo $c.PHP_EOL;
}
