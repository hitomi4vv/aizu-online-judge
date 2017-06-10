process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var line = chunk.trim().toLowerCase(), s = '';
  for(var i = 0; i < line.length; i++) s += line[i] != chunk[i]? line[i]:line[i].toUpperCase();
  console.log(s);
});
