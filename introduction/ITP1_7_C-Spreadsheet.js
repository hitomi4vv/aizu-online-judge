process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var sum = [];
  var lines = chunk.trim().split('\n');
  lines.shift();
  lines.some(function(line) {
    var arr = line.split(' ').map(Number);
    arr.push(arr.reduce(function(a, b){return a+b;}, 0));
    sum.push(arr);
    console.log(arr.join(' '));
  });
  console.log(sum.reduce(function(a, b){return a.map(function(v, i){return v+b[i];});}).join(' '));
});
