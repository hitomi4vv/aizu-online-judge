<?php
while(strpos(($line = trim(fgets(STDIN))), '0 0') === false) {
  list($h, $w) = explode(' ', $line);
  echo str_repeat('#', $w).PHP_EOL;
  echo str_repeat('#'.str_repeat('.', $w-2).'#'.PHP_EOL, $h-2);
  echo str_repeat('#', $w).PHP_EOL.PHP_EOL;
}
