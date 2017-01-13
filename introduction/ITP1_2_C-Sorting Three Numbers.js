process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.toString().trim().split(" ");
  lines = lines.sort(function(a, b) {
    return a - b;
  });
  console.log(lines.join(' '));
});
