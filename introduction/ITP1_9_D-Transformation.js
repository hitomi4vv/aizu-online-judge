var s = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
for(var i = 0; i < s[1]; i++) {
  var o = s[i+2].split(' ');
  console.log(s[0]);
  switch(o[0]) {
    case 'print':
      console.log(s[0].slice(o[1], o[2]+1));
      break;
    case 'reverse':
        break;
    case 'replace':
      break;
  }
}
