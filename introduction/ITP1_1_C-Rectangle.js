process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var lines = chunk.toString().split(" ");
  var a = parseInt(lines[0]);
  var b = parseInt(lines[1]);
  console.log(a*b + " " + (a+b)*2);
});
