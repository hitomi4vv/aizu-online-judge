var s = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 0; i < s[1]; i++) {
  var o = s[i+2].split(' ');
  var a = parseInt(o[1]), b = parseInt(o[2])+1;
  switch(o[0]) {
    case 'print':
      console.log(s[0].slice(a, b));
      break;
    case 'reverse':
      s[0] = s[0].slice(0, a)+s[0].slice(a, b).split('').reverse().join('')+s[0].slice(b);
      break;
    case 'replace':
      s[0] = s[0].slice(0, a)+o[3]+s[0].slice(b);
      break;
  }
}
