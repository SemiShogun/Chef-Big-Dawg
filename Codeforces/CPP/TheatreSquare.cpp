#include <iostream>

using namespace std;

/**
 *  https://codeforces.com/problemset/problem/1/A
 */
int main()
{
    long long n, m, a, answer;
    cin >> n >> m >> a;
    answer = ((n + a - 1)) / a * ((m + a - 1) / a);
    cout << answer << endl;
    return 0;
}