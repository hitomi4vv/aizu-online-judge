process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var lines = chunk.toString().split(" ");
  var a = parseInt(lines[0]);
  var b = parseInt(lines[1]);
  if (a == b) {
    console.log('a == b');
  } else if (a > b) {
    console.log('a > b');
  } else {
    console.log('a < b');
  }
});
