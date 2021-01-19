x=gets.to_i;
if(x.between?(1,100))
  n=gets.to_i;
  if(n.between?(1,100))
    ch=true
    sum=x
    n.times do
      p=gets.to_i;
      if(p.between?(0,10000))
        sum+=x-p
      else
        ch=false
        break
      end
    end
    puts sum if(ch)
  end
end

