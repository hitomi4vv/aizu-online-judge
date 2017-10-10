function Dice(labels) {
  this.labels = labels;
  this.roll = function(dir) {
    var n;
    switch(dir) {
      case 'N': n = [1, 5, 2, 3, 0, 4]; break;
      case 'S': n = [4, 0, 2, 3, 5, 1]; break;
      case 'E': n = [3, 1, 0, 5, 4, 2]; break;
      case 'W': n = [2, 1, 5, 0, 4, 3]; break;
    }
    n.forEach(function(v){labels.push(labels[v]);});
    labels.splice(0, 6);
  };
}

var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var dice = new Dice(lines[0].split(' ').map(Number));
for(var i = 0; i < lines[1]; i++) {
  var q = lines[i+2].split(' ');
  while(dice.labels[0] != q[0] || dice.labels[1] != q[1]) dice.roll('NSEW'[Math.floor(Math.random()*4)]);
  console.log(dice.labels[2]);
}
