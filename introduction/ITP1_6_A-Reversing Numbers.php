<?php
fgets(STDIN);
echo implode(' ', array_reverse(explode(' ', trim(fgets(STDIN))))).PHP_EOL;
