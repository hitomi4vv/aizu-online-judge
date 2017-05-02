<?php
while(strpos(($line = trim(fgets(STDIN))), '-1 -1 -1') === false) {
  list($m, $f, $r) = explode(' ', $line);
  $grade = 'F';
  if($m != -1 && $f != -1 && $m+$f >= 30) {
    $grade = 'D';
    if($m+$f >= 50 || $r >= 50) $grade = 'C';
    if($m+$f >= 65) $grade = 'B';
    if($m+$f >= 80) $grade = 'A';
  }
  echo $grade.PHP_EOL;
}
