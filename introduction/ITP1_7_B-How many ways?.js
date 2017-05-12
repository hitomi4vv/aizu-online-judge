process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  lines.some(function(line) {
    var arr = line.split(' ').map(Number);
    var n = arr[0], x = arr[1], c = 0;
    if(n+x == 0) return true;
    for(var i = 1; i < x/3; i++) c += parseInt(Math.max(Math.min(n, (x-i+1)/2) - Math.max(i+1, x-i-n), 0));
    console.log(c);
  });
});
