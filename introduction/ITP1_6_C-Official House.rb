arr = (1..4).map{(1..3).map{[0]*10}}
gets.to_i.times {
  b, f, r, v = gets.split.map(&:to_i)
  arr[b-1][f-1][r-1] += v
}
puts arr.map{|b| b.map{|f| ' '+f*' '}*"\n"}*("\n"+'#'*20+"\n")
