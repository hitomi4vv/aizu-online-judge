var s = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 0; i < s.length; i++) {
  if(s[i] == '-') return;
  var t = s[i], n = s[i+1]-0;
  for(var j = 0; j < n; j++) {
    var h = s[i+2+j];
    t = t.slice(h) + t.slice(0, h);
  }
  console.log(t);
  i+=n+1;
}
