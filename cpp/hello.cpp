#include <iostream>
using namespace std;
int main() {
    int age;
    cout << "enter your age: ";
    cin >> age;
    double num_double;
     num_double = (double)age + 0.5;
    
    cout << "are you really?  " << num_double << endl;
    return 0;
}