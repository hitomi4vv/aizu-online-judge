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
var labels = new Dice(lines[0].split(' ').map(Number)).labels;
var dice = new Dice(lines[1].split(' ').map(Number));
for(var i = 0; i < 6; i++) {
  if(labels[0] == dice.labels[i]) {
    while(labels[0] != dice.labels[0]) dice.roll('NSEW'[Math.floor(Math.random()*4)]);
    console.log(labels, dice.labels);
    if(labels.toString() === dice.labels.toString()) {
      console.log('Yes');
      return;
    }
  }
}
console.log('No');
