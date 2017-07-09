var arr = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
console.log((arr[0]+arr[0]).indexOf(arr[1])>-1? 'Yes':'No');
