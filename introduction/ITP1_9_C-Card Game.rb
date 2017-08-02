t = h = 0
gets.to_i.times.map {
  p = gets.split.inject(&:<=>)
  t+=3 if p == 1
  h+=3 if p == -1
  if p == 0 then
    t+=1
    h+=1
  end
}
puts [t, h]*' '
