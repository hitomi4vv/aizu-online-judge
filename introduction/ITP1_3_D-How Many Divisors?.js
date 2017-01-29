process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var line = chunk.toString().split(' ');

  var a = parseInt(line[0]);
  var b = parseInt(line[1]);
  var c = parseInt(line[2]);
  var count = 0;
  for (var num = a; num <= b; num++) {
    if (c % num == 0) {
      count++;
    }
  }

  console.log(count);
});
