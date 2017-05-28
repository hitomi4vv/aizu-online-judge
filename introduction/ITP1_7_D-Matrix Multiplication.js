process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var b = chunk.split('\n').map(function(s){return s.split(' ').map(Number);});
  var n = b[0][0], m = b[0][1], l = b[0][2];
  b.shift();
  var a = b.splice(0, n);
  var s = '';
  for(var i = 0; i < n; i++)
    for(var j = 0; j < l; j++) {
      var c = 0;
      for(var k = 0; k < m; k++) c += a[i][k] * b[k][j];
      s += c + (j+1 == l? '\n':' ');
    }
  console.log(s.trim());
});
