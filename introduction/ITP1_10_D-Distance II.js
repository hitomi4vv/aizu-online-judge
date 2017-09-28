var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var n = lines.shift();
var x = lines.shift().split(' ').map(Number), y = lines.shift().split(' ').map(Number);
var d, d1 = 0, d2 = 0, d3 = 0, max = 0;
for(var i = 0; i < n; i++) {
  d = Math.abs(x[i]-y[i]);
  d1 += d;
  d2 += d * d;
  d3 += d * d * d;
  if(max < d) max = d;
}
console.log(d1+'\n'+Math.sqrt(d2)+'\n'+Math.cbrt(d3)+'\n'+max);
