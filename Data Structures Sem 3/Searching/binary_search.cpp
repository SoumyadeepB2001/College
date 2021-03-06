#include <iostream>
using namespace std;
class BinarySearch
{
public:
	int ar[50], len;
	BinarySearch();
	BinarySearch(int x);
	void inputLength();
	void inputArray();
	void binary_search();
	void display();
};

BinarySearch ::BinarySearch()
{
	len = 5;
}

BinarySearch ::BinarySearch(int x)
{
	len = x;
}

void BinarySearch ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void BinarySearch ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void BinarySearch ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

void BinarySearch ::binary_search()
{
	int first = 0, last = len - 1, mid, value, comp=0;
	cout << "Enter the value to be searched" << endl;
	cin >> value;
	while (first <= last)
	{
		mid = (first + last) / 2;
	comp++;
		if (ar[mid] == value)
		{
			cout << "Value Found" << endl;
			cout<<"Number of comparisons = "<<comp<<endl;
			return;
		}
		else if (value < ar[mid])
			last = mid - 1;
		else
			first = mid + 1;
	}
	cout << "Value Not Found" << endl;
	cout<<"Number of comparisons = "<<comp<<endl;
}

int main()
{
	cout << "Default Constructor" << endl;
	BinarySearch ob;
	ob.inputArray();
	ob.display();
	ob.binary_search();

	cout << "Parameterised Constructor" << endl;
	BinarySearch ob1(4);
	ob1.inputArray();
	ob1.display();
	ob1.binary_search();

	cout << "Input length function" << endl;
	BinarySearch ob2;
	ob2.inputLength();
	ob2.inputArray();
	ob2.display();
	ob2.binary_search();
}
