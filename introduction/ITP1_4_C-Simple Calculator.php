<?php
while(strpos(($line = trim(fgets(STDIN))), '?') === false) {
  echo eval('return floor(' . $line . ');') . PHP_EOL;
}
