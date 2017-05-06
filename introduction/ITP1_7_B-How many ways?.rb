while (n, x = gets.split.map(&:to_i)) != [0, 0]
  puts [*1..n].combination(3).map{|i| i.reduce(:+)}.count(x)
end
