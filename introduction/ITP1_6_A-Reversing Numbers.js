process.stdin.resume();
process.stdin.setEncoding('utf8');

var input_string = '';

process.stdin.on('data', function(chunk) {
  input_string += chunk;
});

process.stdin.on('end', function() {
  var lines = input_string.split('\n');
  var arr = lines[1].split(' ').reverse();
  console.log(arr.join(' '));
});
