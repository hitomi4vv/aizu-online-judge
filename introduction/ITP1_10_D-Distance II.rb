gets
d = gets.split.map(&:to_f).zip(gets.split.map(&:to_f)).map{|x, y|(x-y).abs}
(1..3).each{|p| puts d.map{|v| v**p}.reduce(:+)**(1.0/p)}
puts d.max
