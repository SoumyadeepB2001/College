#include <stdio.h>
int main()
{
	int a[20], len, i,j;
	printf("Enter the length of the array \n");
	scanf("%d", &len);
	
	printf("Enter the value of the array \n");
	for(i=0; i<len; i++)
	{
		scanf("%d", &a[i]);
	}
	
	printf("Value of the before array \n");
	for(i=0; i<len; i++)
	{
		printf("%d ", a[i]);
	}
	
	j=a[0];
	
	//left shift from front side
	for (i=1; i<len; i++)
	{
		a[i-1] = a[i];
	}
	printf("\n Deleted value = %d \n",j);
	printf("Value of the after array \n");
	len--;
	for(i=0; i<len; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");
	
	return 0;
} 
