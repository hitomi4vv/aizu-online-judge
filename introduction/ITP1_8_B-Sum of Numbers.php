<?php
while(($line = trim(fgets(STDIN))) != '0') echo array_sum(str_split($line)).PHP_EOL;
