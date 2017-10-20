class Dice

  def initialize(labels)
    @labels = labels
  end

  def roll(dir)
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
