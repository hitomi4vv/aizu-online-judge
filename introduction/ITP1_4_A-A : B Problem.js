process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var line = chunk.toString().split(' ');

  var a = Number(line[0]);
  var b = Number(line[1]);

  console.log(Math.floor(a/b) + ' ' + Math.floor(a%b) + ' ' + (a/b).toFixed(5));
});
