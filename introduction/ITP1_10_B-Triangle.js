var p = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n')[0].split(' ').map(Number);
var a = p[0], b = p[1], c = p[2]*Math.PI/180, h = b*Math.sin(c);
console.log(a*h*.5+'\n'+(a+b+Math.sqrt(a*a+b*b-2*a*b*(Math.cos(c))))+'\n'+h);
