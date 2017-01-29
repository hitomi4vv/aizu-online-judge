a, b, c = gets.split.map(&:to_i)
puts (a..b).count{|num| c % num == 0}
