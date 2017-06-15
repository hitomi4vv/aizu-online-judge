<?php
$s = fgets(STDIN);
for($i = 0; $i < strlen($s); $i++) echo ctype_lower($s[$i])? strtoupper($s[$i]):strtolower($s[$i]);
