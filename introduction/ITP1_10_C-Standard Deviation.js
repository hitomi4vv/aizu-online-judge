var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
while(lines[0] != '0') {
  var n = lines.shift(), m = 0, sum = 0;
  var arr = lines.shift().split(' ').map(Number);
  for(var i = 0; i < n; i++) {
    s = arr[i];
    m += s;
    sum += s*s;
  }
  m /= n;
  console.log(Math.sqrt(sum/n-m*m));
}
