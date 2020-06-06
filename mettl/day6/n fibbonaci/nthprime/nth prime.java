int k=2,d=0,i,c=0,p=0;
while(d<=input1){
for(i=2;i<k/2;i++){
if(k%i==0){
c++;
}
}
if(c==0){
d++;
p=k;
}
k++;
c=0;
}
return p;
