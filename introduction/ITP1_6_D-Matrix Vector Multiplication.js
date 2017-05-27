process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  var arr = lines.shift().split(' ').map(Number);
  var n = arr[0], m = arr[1];
  var a = lines.splice(0, n), b = lines.splice(0, m);
  for(var i = 0; i < n; i++) {
    var sum = 0;
    for(var j = 0; j < m; j++) sum += a[i].split(' ')[j] * b[j];
    console.log(sum);
  }
});
