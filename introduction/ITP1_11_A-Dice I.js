function Dice(labels) {
  this.labels = labels;
  this.roll = function(dir) {
    console.log(this, dir);
  };
}

var lines = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var dice = new Dice(lines[0].split(' ').map(Number));
lines[1].split('').forEach(function(e) {
  dice.roll(e);
});
