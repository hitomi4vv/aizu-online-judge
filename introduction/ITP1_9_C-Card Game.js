var t=0, h=0;
var arr = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 1; i <= arr[0]; i++) {
  var s = arr[i].split(' ');
  if(s[0]==s[1]){t++;h++} else if(s[0]>s[1]) t+=3; else if(s[0]<s[1]) h+=3;
}
console.log(t+' '+h);
