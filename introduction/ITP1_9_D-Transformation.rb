s = gets
gets.to_i.times do
    o, a, b, p = gets.split
    a = a.to_i
    b = b.to_i
    case o
    when 'print' then
      puts s[a..b]
    when 'reverse' then
      s[a..b] = s[a..b].reverse
    when 'replace' then
      s[a..b] = p
    end
end
