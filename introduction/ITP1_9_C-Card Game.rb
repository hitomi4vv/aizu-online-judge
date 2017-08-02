t = h = 0
gets.to_i.times.map{
  case gets.split.inject(&:<=>)
    when -1
      h += 3
    when 0
      t += 1
      h += 1
    when 1
      t += 3
  end
}
puts [t, h]*' '
