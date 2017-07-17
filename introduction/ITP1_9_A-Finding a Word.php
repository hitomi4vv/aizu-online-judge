<?php
$w = trim(fgets(STDIN));
$c = 0;
while(($t = trim(fgets(STDIN))) != 'END_OF_TEXT') {
  $t = explode(' ', strtolower($t));
  foreach($t as $s) if($s == $w) $c++;
}
echo $c;
?>
