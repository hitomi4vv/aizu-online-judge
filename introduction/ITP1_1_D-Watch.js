process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (chunk) {
  var time = parseInt(chunk);
  var hour = parseInt(time / 3600);
  var minutes = parseInt((time / 60) % 60);
  var seconds = parseInt(time % 60);
  console.log(hour + ':' + minutes + ':' + seconds);
});
