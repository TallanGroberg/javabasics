#include <iostream>
using namespace std;

int main() {
    int n = 3;

    int counter = 0;

    for (int i = 0; i < n; n--)
    {

        /* code */
        counter = (n + counter) ;
    }
    
    cout << counter << endl;

    return 0;
}