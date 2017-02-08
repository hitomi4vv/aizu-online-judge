process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var lines = chunk.toString().split('\n');
  for(var i = 0; i < lines.length; i++) {
    var line = lines[i];
    if(line.match(/\?/)) {
      break;
    }
    console.log(Math.floor(eval(line)));
  }
});
