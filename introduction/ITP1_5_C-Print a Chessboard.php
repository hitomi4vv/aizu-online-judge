<?php
while(strpos(($line = trim(fgets(STDIN))), '0 0') === false) {
  list($h, $w) = explode(' ', $line);
  for($i = 0; $i < $h; $i++)
    echo str_repeat($i%2===0? '#.':'.#', $w/2).($w%2===0? '':($i%2===0? '#':'.')).PHP_EOL;
  echo PHP_EOL;
}
