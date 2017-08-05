var t, h = 0;
var arr = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 1; i <= arr[0]; i++) {
  var s = arr[i].split('\n');
  console.log(s);
}
