s = $<.read.downcase
puts (?a..?z).map{|c| "#{c} : #{s.count(c)}"}
