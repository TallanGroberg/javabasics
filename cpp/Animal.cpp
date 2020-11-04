
#include <iostream>
using namespace std;

//would not call on this class directly but would use this for the top of inheritence patern for highest level of abstraction. 
class Animal
{

public:
    void eat() {
        cout << "I eat!" << endl;
    }

    void sleep() {
        cout << "ZZZZZZzzzz" << endl;
    }
};
