<?php
$s = array_fill_keys(range('a', 'z'), 0);
while($line = strtolower(trim(fgets(STDIN))))
  foreach($s as $c => $v) $s[$c] += substr_count($line, $c);
foreach($s as $c => $v) echo $c.' : '.$v.PHP_EOL;
