while 0 != n = gets.to_f
  a = gets.split.map(&:to_i)
  m = -> x{x.reduce(:+)/n}
  p m[a.map{|s|(s-m[a])**2}]**0.5
end
