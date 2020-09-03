// Example program
#include <iostream>
#include <string>

using namespace std;

/**
 *  https://codeforces.com/problemset/problem/231/A
 */
int main()
{
    int n, petra, vasya, tonya, problems = 0; // Number of problems
    cin >> n;
    
    while(n--) {
        cin >> petra >> vasya >> tonya;
        
        if (petra + vasya + tonya >= 2) {
            problems+=1;
        }
    }
    
    cout << problems << endl;
    return 0;
}
