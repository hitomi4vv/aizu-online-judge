<?php
$n = fgets(STDIN);
$arr = array_fill(0, 4, array_fill(0, 3, array_fill(0, 10, 0)));
for($i = 0; $i < $n; $i++) {
  $line = explode(' ', trim(fgets(STDIN)));
  $arr[$line[0]-1][$line[1]-1][$line[2]-1] += $line[3];
}
for($b = 0; $b < 4; $b++) {
  if($b > 0) echo str_repeat('#', 20).PHP_EOL;
  for($f = 0; $f < 3; $f++) echo ' '.implode(' ', $arr[$b][$f]).PHP_EOL;
}
