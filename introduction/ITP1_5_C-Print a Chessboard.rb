while(h, w = gets.split.map(&:to_i)) != [0, 0]
  h.times{|i|puts ('#.' * w)[i%2, w]}
  puts
end
