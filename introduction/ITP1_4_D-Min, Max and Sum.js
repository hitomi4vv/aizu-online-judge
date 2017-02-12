process.stdin.resume();
process.stdin.setEncoding('utf8');

var input_string = '';

process.stdin.on('data', function(chunk) {
  input_string += chunk;
});

process.stdin.on('end', function() {
  var lines = input_string.split('\n');
  var arr = lines[1].split(' ').slice(0, lines[0]).map(Number);
  console.log(
    Math.min.apply(null, arr) + ' ' +
    Math.max.apply(null, arr) + ' ' +
    arr.reduce(function(a, b) {
      return a + b;
    }));
});
