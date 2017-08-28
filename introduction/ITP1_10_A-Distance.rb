p = gets.split.map(&:to_f)
puts Math.hypot(p[2]-p[0], p[3]-p[1])
