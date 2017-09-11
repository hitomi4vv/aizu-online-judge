include Math
a,b,c = gets.split.map(&:to_f)
c *= PI/180
h = b*sin(c)
puts a*h*0.5,a+b+sqrt(a*a+b*b-2*a*b*cos(c)),h
