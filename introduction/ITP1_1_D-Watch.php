<?php
$input_lines = fgets(STDIN);
$time = trim($input_lines);
$hour = floor($time / 3600);
$minutes = floor(($time / 60) % 60);
$seconds = floor($time % 60);
echo $hour . ':' . $minutes . ':' . $seconds;
?>
