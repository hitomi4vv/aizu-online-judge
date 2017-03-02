while(h, w = gets.split.map(&:to_i)) != [0, 0]
  puts '#' * w
  (h-2).times{puts '#' + '.' * (w-2) + '#'}
  puts '#' * w
  puts
end
