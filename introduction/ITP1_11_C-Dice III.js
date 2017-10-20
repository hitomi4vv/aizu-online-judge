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
  var dice = new Dice(l);
  var dirs = 'EEEENEEEENEEEENEEENEEEENNEEEE';
  for(var i = 0; i < dirs.length; i++) {
    if(this.labels.toString() == dice.labels.toString()) return true;
    dice.roll(dirs[i]);
  }
  return false;
}

var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var labels = new Dice(lines[0].split(' ').map(Number)).labels;
var dice = new Dice(lines[1].split(' ').map(Number));
console.log(dice.setDirection(labels)? 'Yes':'No');
