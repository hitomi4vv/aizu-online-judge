w, h, x, y, r = gets.split.map(&:to_i)
if r <= x && x <= w - r && r <= y && y <= h - r then
  puts "Yes"
else
  puts "No"
end
