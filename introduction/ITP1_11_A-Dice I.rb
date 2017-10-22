class Dice

  def initialize(labels)
    @labels = labels
  end

  def roll(dir)
    a, b, c, d, e, f = @labels
    case dir
    when 'N' then @labels = [b, f, c, d, a, e]
    when 'S' then @labels = [e, a, c, d, f, b]
    when 'E' then @labels = [d, b, a, f, e, c]
    when 'W' then @labels = [c, b, f, a, e, d]
    end
  end

  def top
    @labels[0]
  end

end

dice = Dice.new(gets.split.map(&:to_i))
gets.split('').each do | v |
  dice.roll(v)
end
puts dice.top
