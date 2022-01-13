int main(){

int n,i,a[5000],b[5000],min=a[0],steps=0,flag=0;

printf("Enter the size of array: ");
scanf("%d",&n);
printf("Enter the element of a: ");
for(i=0;i<n;i++) scanf("%d",&a[i]);
printf("Enter the element of b: ");
for(i=0;i<n;i++) scanf("%d",&b[i]);

min=a[0];
for(i=1;i<n;i++){
     if(a[i]<min){
         min=a[i];
     }
}

for(i=0;i<n;i++){
   while(a[i]>min && b[i]!=0){
        a[i]-=b[i];
        steps++;
    }

   if(a[i]<0){
    flag=1;
     break;
    }

     if(a[i]<min){
     min=a[i];
      i=-1;
     }
     }
if(flag!=1) printf("steps that require: %d",steps);

else printf("-1");

}