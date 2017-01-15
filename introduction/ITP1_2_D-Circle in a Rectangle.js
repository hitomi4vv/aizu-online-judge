process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var line = chunk.toString().split(" ");

  var w = parseInt(line[0]);
  var h = parseInt(line[1]);
  var x = parseInt(line[2]);
  var y = parseInt(line[3]);
  var r = parseInt(line[4]);

  if (r <= x && x <= w - r && r <= y && y <= h - r) {
    console.log('Yes');
  } else {
    console.log('No');
  }
});
