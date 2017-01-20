process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var lines = chunk.toString().split('\n');
  for (var i = 0; i < lines.length; i++) {
    if (lines[i] != 0) {
      console.log('Case ' + (i+1) + ': ' + lines[i]);
    }
  }
});
