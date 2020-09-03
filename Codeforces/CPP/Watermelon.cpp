#include <iostream>

using namespace std;

/**
 *  https://codeforces.com/problemset/problem/4/A
 */
int main()
{
    int w;
    cin >> w;
    if (w % 2 == 0 && w > 2) {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}