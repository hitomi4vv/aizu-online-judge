<?php
$s = trim(fgets(STDIN));
echo (strpos($s.$s, trim(fgets(STDIN)))===false? 'No':'Yes');
?>
