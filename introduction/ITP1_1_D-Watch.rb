time = gets.to_i
hour = time / 3600;
minutes = (time / 60) % 60;
seconds = time % 60;
puts "#{hour}:#{minutes}:#{seconds}"
