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
	
	printf("Value of the array before insertion \n");
	for(i=0; i<len; i++)
	{
		printf("%d ", a[i]);
	}
	
	printf("\n Enter a value for insertion \n");
	scanf("%d", &j);
	
	//right shift from end
	len++;
	a[len-1] = j;	//new value insertion
	
	printf("Value of the after array \n");
	for(i=0; i<len; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");
	
	return 0;
} 
