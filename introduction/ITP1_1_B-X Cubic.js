process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var line = chunk.toString();
  var x = parseInt(line);
  console.log(Math.pow(x, 3));
});
