while (arr = gets.chomp.split.map(&:to_i).sort) != [0, 0]
  puts arr * ' '
end
