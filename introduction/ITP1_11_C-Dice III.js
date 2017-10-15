function Dice(labels) {
  this.labels = labels;
}
Dice.prototype.roll = function(dir) {
  var n;
  switch(dir) {
    case 'N': n = [1, 5, 2, 3, 0, 4]; break;
    case 'S': n = [4, 0, 2, 3, 5, 1]; break;
    case 'E': n = [3, 1, 0, 5, 4, 2]; break;
    case 'W': n = [2, 1, 5, 0, 4, 3]; break;
  }
  var l = this.labels;
  this.labels = [l[n[0]],l[n[1]],l[n[2]],l[n[3]],l[n[4]],l[n[5]]];
}
Dice.prototype.setDirection = function(l) {
  for(var i = 0; i < 8; i++) {
    if(this.labels[1] == l[1]) break;
    this.roll("NW"[i%4/3|0]);
  }
  while(this.labels[0] != l[0]) dice.roll('W');
  if(l.length < 3) return;
  for(i = 0; i < 8; i++) {
    if(this.labels[3] == l[3]) break;
    this.roll("NW"[i%4/3|0]);
  }
}

var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var labels = new Dice(lines[0].split(' ').map(Number)).labels;
var dice = new Dice(lines[1].split(' ').map(Number));
dice.setDirection(labels);
console.log(labels.toString() == dice.labels.toString()? 'Yes':'No');
