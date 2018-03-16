figure();
x1=0:1:2*pi;
y1=sin(x1);
x2=0:0.01:2*pi;
y2=sin(x2);
plot(x1,y1,'sk',x2,y2,'r--')
title('some size curves')
xlabel('x')
ylabel('sin(x)')
legend('7 data points','629 data','location','northeast')
grid on
axis tight