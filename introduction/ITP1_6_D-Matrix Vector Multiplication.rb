require 'matrix'
M = Matrix
b = $<.map{|l| l.split.map &:to_i}
puts *M[*(b.shift b.shift[0])]*M[*b]
