var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var dice = lines[0].split(' ').map(Number);
var nsew = lines[1];

console.log(dice, nsew);
