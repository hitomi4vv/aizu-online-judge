n = gets
arr = gets.chomp.split.map(&:to_i)
puts "#{arr.min} #{arr.max} #{arr.reduce(:+)}"
