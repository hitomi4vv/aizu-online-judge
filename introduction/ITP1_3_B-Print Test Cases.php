<?php
$count = 1;
while (($line = fgets(STDIN)) != 0) {
  echo('Case ' . $count . ': ' . $line);
  $count++;
}
