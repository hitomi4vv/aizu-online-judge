process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  var line = lines[0].split(' ').map(Number);
  var n = line[0], m = line[1], l = line[2];
  console.log(n, m, l, line);
});
