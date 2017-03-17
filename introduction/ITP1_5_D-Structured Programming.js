process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  var str = '';
  for(var i = 3; i <= chunk; i++)
    if(i%3 === 0 || i.toString().indexOf('3') >= 0) str += ' ' + i;
  console.log(str);
});
