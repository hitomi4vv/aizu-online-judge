process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var lines = chunk.toString().split(" ");

  var a = parseInt(lines[0]);
  var b = parseInt(lines[1]);
  var c = parseInt(lines[2]);

  if (a < b && b < c) {
    console.log('Yes');
  } else {
    console.log('No');
  }
});
