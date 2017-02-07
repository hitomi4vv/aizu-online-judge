loop do
  line = gets.chomp
  break if line.include? '?'
  puts eval(line)
end
