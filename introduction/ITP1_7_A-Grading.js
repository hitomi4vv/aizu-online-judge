process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  lines.some(function(line) {
    var arr = line.split(' ').map(Number);
    var m = arr[0], f = arr[1], r = arr[2];
    if(m+f+r == -3) return true;
    var grade = 'F';
    if(m != -1 && f != -1 && m+f >= 30) {
      grade = 'D';
      if(m+f >= 50 || r >= 50) grade = 'C';
      if(m+f >= 65) grade = 'B';
      if(m+f >= 80) grade = 'A';
    }
    console.log(grade);
  });
});
