puts %w(S H C D).flat_map{|suit| (1..13).map{|i| "#{suit} #{i}\n"}}-[*$<]
