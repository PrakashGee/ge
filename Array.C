#include<stdio.h>
int main()
{
    int arr[10],i,n;
    
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        printf("%d %d\n",arr[i],i);
    }
    return 0;
    
}
