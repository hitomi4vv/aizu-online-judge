process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var line = chunk.toString();
  var r = Number(line);
  console.log(r*r*Math.PI + ' ' + 2*Math.PI*r);
});
