<?php
$cards = array();
array_map(function($suit) use (&$cards) { foreach(range(1, 13) as $i) array_push($cards, $suit.' '.$i); }, array('S', 'H', 'C', 'D'));
while($card = fgets(STDIN)) $cards = array_values(array_diff($cards, array(str_replace(PHP_EOL, '', $card))));
echo (count($cards) != 0? implode(PHP_EOL, ($cards)).PHP_EOL:'');
