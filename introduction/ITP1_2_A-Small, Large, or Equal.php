<?php
$input_lines = fgets(STDIN);
$ab = explode(' ', trim($input_lines));
$a = $ab[0];
$b = $ab[1];
if ($a == $b) {
  echo 'a == b';
} elseif ($a > $b) {
  echo 'a > b';
} else {
  echo 'a < b';
}

?>
