var chunk = require('fs').readFileSync('/dev/stdin', 'utf8');
var line = chunk.trim().toLowerCase(), s = '';
for(var i = 0; i < line.length; i++) s += line[i] != chunk[i]? line[i]:line[i].toUpperCase();
console.log(s);
