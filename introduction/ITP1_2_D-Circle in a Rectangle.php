<?php
$input_lines = fgets(STDIN);

$line = explode(' ', trim($input_lines));
$w = $line[0];
$h = $line[1];
$x = $line[2];
$y = $line[3];
$r = $line[4];

if ($r <= $x && $x <= $w - $r && $r <= $y && $y <= $h - $r) {
  echo 'Yes';
} else {
  echo 'No';
}
?>
