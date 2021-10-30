#include <iostream>
#include <string>
using namespace std;

int main()
{
	cout << "\t\" \n\t\"\"   \n\t\"\"\"  \n\t\"\"\"\" \n\t\"\"\"\"\" \n\t\"\"\"\"   \n\t\"\"\" \n\t\"\"  \n\t\""  << endl;
	cout << "name this" << endl;
	string s;
	cin >> s;
	cout << "I will name this: " << s << endl;
	cout << "G \t" << int('G') << endl;
	cout << "u \t" << int('u') << endl;
	cout << "r \t" << int('r') << endl;
	cout << "u \t" << int('u') << endl;
	cout << " \t" << int(' ') << endl;
	cout << "B \t" << int('B') << endl;
	cout << "a \t" << int('a') << endl;
	cout << "z \t" << int('z') << endl;
	cout << "a \t" << int('a') << endl;
	cout << "w \t" << int('w') << endl;
	cout << "a \t" << int('a') << endl;
	cout << "d \t" << int('d') << endl;
	cout << "a \t" << int('a') << endl;



	cout << "How much you make per month" << endl;
	double d;
	int a;
	cin >> d;
	cout << "How old are you" << endl;
	cin >> a;


	cout << "ur new salary is " <<(1+ ((double)a / 100))* d << endl;
	return 0;
}
