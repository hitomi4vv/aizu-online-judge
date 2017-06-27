require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').some(function(line) {
  if(line == '0') return;
  console.log(line.split('').map(Number).reduce(function(a, b){return a+b;}));
});
