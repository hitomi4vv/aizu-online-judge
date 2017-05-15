gets
puts (r = -> c{c.map{|i| i << i.reduce(:+)}.transpose})[r[$<.map{|i| i.split.map &:to_i}]].map{|i| i*' '}
