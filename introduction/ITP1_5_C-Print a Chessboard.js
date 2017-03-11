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
    for(var j = 0; j < h; j++)
      console.log(Array(w+1).join(j%2===0? '#.':'.#').slice(0, w));
    console.log('');
  }
});
