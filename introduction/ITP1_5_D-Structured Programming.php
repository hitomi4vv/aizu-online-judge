<?php
$n = fgets(STDIN);
for ($i = 1; $i <= $n; $i++)
  if ($i%3 == 0 || strpos($i, '3') !== false) echo ' '.$i;
echo PHP_EOL;
