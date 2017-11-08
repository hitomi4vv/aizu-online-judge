class Dice

  def initialize(labels)
    @labels = labels
    @patterns = []
    7.times do |i|
      roll(i<4?'N':'W')
      if i == 5 then
        next
      end
      @patterns.concat(all(@labels))
    end
    @patterns = @patterns.uniq
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

  def all(l)
    return [[l[0], l[1], l[2], l[3], l[4], l[5]], [l[0], l[2], l[4], l[1], l[3], l[5]], [l[0], l[4], l[3], l[2], l[1], l[5]], [l[0], l[3], l[1], l[4], l[2], l[5]]]
  end

  def patterns
    @patterns
  end

end

n = gets.to_i
dices = []
n.times do
  dices.push(Dice.new(gets.split.map(&:to_i)))
end
puts dices
