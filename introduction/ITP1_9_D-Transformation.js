var s = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 0; i < s[1]; i++) {
  var o = s[i+2].split(' ');
  console.log(o);
}
