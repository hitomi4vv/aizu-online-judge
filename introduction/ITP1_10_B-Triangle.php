<?php
list($a,$b,$c) = explode(' ',trim(fgets(STDIN)));
$c = $c*M_PI/180;
$h = $b*sin($c);
echo ($a*$h*.5)."\n".($a+$b+sqrt($a*$a+$b*$b-2*$a*$b*cos($c)))."\n".$h;
