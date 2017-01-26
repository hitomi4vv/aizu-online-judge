process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.toString().trim().split('\n');
  for (var i = 0; i < lines.length; i++) {
    var line = lines[i];
    if (line == '0 0') {
      break;
    }
    line = line.split(' ').sort(function(a, b) {
      return a - b;
    });
    console.log(line.join(' '));
  }
});
