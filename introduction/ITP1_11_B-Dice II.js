function Dice(labels) {
  this.labels = labels;
  this.patterns = [];
  var all = function(l) {return [[l[0], l[1], l[2], l[3], l[4], l[5]], [l[0], l[2], l[4], l[1], l[3], l[5]], [l[0], l[4], l[3], l[2], l[1], l[5]], [l[0], l[3], l[1], l[4], l[2], l[5]]];};
  for(var i = 0; i < 7; i++) {
    this.roll(i<4?'N':'W');
    if(i==5) continue;
    this.patterns = this.patterns.concat(all(this.labels));
  }
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

var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var dice = new Dice(lines[0].split(' ').map(Number));
for(var i = 0; i < lines[1]; i++) {
  for(var j = 0; j < dice.patterns.length; j++) {
    var p = dice.patterns[j];
    if(p.slice(0, 2).join(' ') == lines[i+2]) {
      console.log(p[2]);
      break;
    }
  }
}
