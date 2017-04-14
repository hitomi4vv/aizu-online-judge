process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  var obj = {};
  for(var i = 1; i < lines.length; i++) {
    var line = lines[i].split(' ').map(Number);
    var bfr = (line[0]-1) + '-' + (line[1]-1) + '-' + (line[2]-1);
    obj[bfr] = obj[bfr]? obj[bfr] + line[3] : line[3];
  }
  for(var b = 0; b < 4; b++) {
    if(b > 0) console.log(Array(21).join('#'));
    for(var f = 0; f < 3; f++) {
      var str = '';
      for(var r = 0; r < 10; r++) {
        bfr = b + '-' + f + '-' + r;
        str += ' ' + (obj[bfr]? obj[bfr] : 0);
      }
      console.log(str);
    }
  }
});
