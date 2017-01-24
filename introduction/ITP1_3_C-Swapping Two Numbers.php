<?php
while ($ab = explode(' ', trim(fgets(STDIN)))) {
  if ($ab == [0, 0]) {
    break;
  }
  sort($ab);
  echo implode(' ', $ab) . PHP_EOL;
}
