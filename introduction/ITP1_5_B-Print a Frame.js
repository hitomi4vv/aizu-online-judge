process.stdin.resume();
process.stdin.setEncoding('utf8');

var input_string = '';

process.stdin.on('data', function(chunk) {
  input_string += chunk;
});

process.stdin.on('end', function() {
  var lines = input_string.split('\n');
  for(var i = 0; i < lines.length; i++){
    var line = lines[i].split(' ');
    var h = parseInt(line[0]);
    var w = parseInt(line[1]);
    if(h + w === 0) break;
    console.log(repeatstr(w) + '\n' + repeatstr(h-2, '#' + repeatstr(w-2, '.') + '#\n') + repeatstr(w) + '\n');
  }
});

function repeatstr(n, s) { return Array(n+1).join(s? s:'#'); }
