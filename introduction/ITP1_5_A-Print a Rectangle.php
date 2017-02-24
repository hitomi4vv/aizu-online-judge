<?php
while(strpos(($line = trim(fgets(STDIN))), '0 0') === false) {
  list($h, $w) = explode(' ', $line);
  echo str_repeat(str_repeat('#', $w).PHP_EOL, $h).PHP_EOL;
}
