#include <bits/stdc++.h>
using namespace std;

#define int int64_t

// Subtask 1
signed main()
{
	ios_base::sync_with_stdio(false);
	freopen("bamboo-sub1-attempt4.txt", "r", stdin);

	int T;

	// Test cases
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		int n;
		cin >> n;
		vector<int> v(n);
		for (int j = 0; j < n; j++)
		{
			cin >> v[j];
		}
		int cuts = 0;

		if (v[0] == v[1] && v[1] == v[2])
		{
			cuts = 1;
		}
		else if (v[0] < v[1] && v[1] > v[2])
		{
			cuts = 3;
		}
		else if (v[0] == v[1] || v[0] == v[2] || v[1] == v[2])
		{
			cuts = 2;
		}
		else
		{
			cuts = 3;
		}

		cout << "Case #" << i << " :" << cuts << '\n';
	}
}
