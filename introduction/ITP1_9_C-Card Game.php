<?php
$t = $h = 0;
$n = fgets(STDIN);
for($i = 0; $i < $n; $i++) {
  $ab = explode(' ', trim(fgets(STDIN)));
  if($ab[0] == $ab[1]){$t++; $h++;}
  elseif($ab[0] > $ab[1]) $t+=3;
  elseif($ab[0] < $ab[1]) $h+=3;
}
echo $t.' '.$h.PHP_EOL;
