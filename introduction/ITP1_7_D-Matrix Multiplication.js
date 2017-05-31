var lines = '';

process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {lines += chunk;});
process.stdin.on('end', function() {
  var b = lines.trim().split('\n').map(function(s){return s.split(' ').map(Number);});
  var n = b[0][0], m = b[0][1], l = b[0][2];
  b.shift();
  var a = b.splice(0, n);
  var c = '';
  for(var i = 0; i < n; i++)
    for(var j = 0; j < l; j++) {
      var s = 0;
      for(var k = 0; k < m; k++) s += a[i][k] * b[k][j];
      c += s + (j+1 == l? '\n':' ');
    }
  console.log(c.trim());
});
