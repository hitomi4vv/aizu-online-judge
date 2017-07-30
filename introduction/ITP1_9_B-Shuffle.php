<?php
while(($s = trim(fgets(STDIN))) != '-') {
  $n = fgets(STDIN);
  for($i = 0; $i < $n; $i++) {
    $h = trim(fgets(STDIN));
    $s = substr($s, $h).substr($s, 0, $h);
  }
  echo $s.PHP_EOL;
}
