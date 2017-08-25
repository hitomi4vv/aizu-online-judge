var p = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n')[0].split(' ').map(Number);
console.log(Math.sqrt(Math.pow(p[0]-p[2],2)+Math.pow(p[1]-p[3],2)));
