#include <iostream>
using namespace std;

int saveMoney(int);
int withdrawMoney(int);
void showBalance();



int saveMoney(int a)
{
	
	int sum = 0;
	for (int i = 1; i < a; i++)
		sum +=i;
	for (int call = 1; call < a; call++)
		call++;
	return a;
}
int withdrawMoney(int b)
{
	return b;
}
void showBalance()
{
	cout << "현재 잔금은 "  << "입니다.";
}