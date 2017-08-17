<?php
$s = fgets(STDIN);
$n = fgets(STDIN);
for($i = 0; $i < $n; $i++) {
  $o = explode(' ', trim(fgets(STDIN)));
  $a = intval($o[1]);
  $b = intval($o[2])+1;
  switch($o[0]) {
    case 'print':
      echo substr($s, $a, $b).PHP_EOL;
      break;
    case 'reverse':
      $s = substr($s, 0, $a).strrev(substr($s, $a, $b)).substr($s, $b);
      break;
    case 'replace':
      $s = substr($s, 0, $a).$o[3].substr($s, $b);
      break;
  }
}
