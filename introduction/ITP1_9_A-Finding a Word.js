var arr = require('fs').readFileSync('/dev/stdin', 'utf8').toLowerCase().trim().split('\n');
var w = arr[0];
var c = 0;
for(var i = 1; i < arr.length; i++) {
  if(arr[i] == 'END_OF_TEXT') break;
  arr[i].split(' ').forEach(function(t){if(t == w) c++;});
}
console.log(c);
