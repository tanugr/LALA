C=[2 3 4 5]
a=[2 3 -1 4; 1 -2 6 -7]
b=[8 ; 3]
m=length(b)
n=length(a)
p=nchoosek(n,m)
q=nchoosek(1:n, m)
sol=[]

if n>=m 
  for i=1:p 
    y=zeros(n,1)
    s=q(i,:)
    t=a(:,s)
    x=inv(t)*b 
    if x>0
      y(s)=x 
      sol=[sol y]
    end 
  end 
  else 
    fprintf('no solution')
end
z=C*sol
maximum=max(z)
disp(maximum)
