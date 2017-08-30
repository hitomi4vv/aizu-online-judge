<?php
$p = explode(' ', trim(fgets(STDIN)));
echo hypot($p[2]-$p[0], $p[3]-$p[1]);
