var s = [], c, i;
require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').some(function(line) {
  for(i = 0; i < line.length; i++) {
    c = line[i].toLowerCase();
    if(s[c]) s[c]++; else s[c] = 1;
  }
});
for(i = 'a'.charCodeAt(0); i <= 'z'.charCodeAt(0); i++) {
  c = String.fromCharCode(i);
  console.log(c + ' : ' + (s[c] || 0));
}
