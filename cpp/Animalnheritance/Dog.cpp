#include "./Animal.cpp"

#include <iostream>
using namespace std;


//dog has all of the attributes of an animal but also has the ability to bark
class Dog : public Animal {
    
    public: 
        void bark() {
            cout << "bark ruff ruff" << endl;
        }
};