#include <iostream>
#include "main.h"
using namespace std;

int balance;
int input = 0;
int output = 0;
extern int call;

int main()
{
	cout << "Welcome to the Lalala bank!!!" << endl;
	cout << "1. �Ա�  2. ���  3. �ܱ�  4. ����" << endl;
	while (1)
	{
		
		int n;
		cout << "����: ";
		cin >> n;
		switch(n) 
		{
		case 1:
			cout << "�Ա��� �ݾ��� �Է����ּ���: ";
			cin >> input;
			int saveMoney(input);
			
			cout << "�Աݱݾ�: " << input << "   �Ա�Ƚ��:" <<call<< endl;
			break;
		
		
		}
	}
}
