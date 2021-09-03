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
	cout << "1. 입금  2. 출금  3. 잔금  4. 종료" << endl;
	while (1)
	{
		
		int n;
		cout << "선택: ";
		cin >> n;
		switch(n) 
		{
		case 1:
			cout << "입금할 금액을 입력해주세요: ";
			cin >> input;
			int saveMoney(input);
			
			cout << "입금금액: " << input << "   입금횟수:" <<call<< endl;
			break;
		
		
		}
	}
}
