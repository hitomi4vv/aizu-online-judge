process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var lines = chunk.split('\n');
  ['S', 'H', 'C', 'D'].forEach(function(suit) {
    for(var i = 1; i <= 13; i++) {
      var card = suit + ' ' + i;
      if(lines.indexOf(card) == -1) console.log(card);
    }
  });
});
