#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define ld long double
#define vll vector<ll>
#define vi vector<int>
#define vb vector<bool>
#define pi pair<int, int>
#define pll pair<ll, ll>
#define vp vector<pi>
#define vpll vector<pll>
#define pb push_back
#define mp make_pair
#define mt make_tuple
#define F first
#define S second
#define For(i, a, b) for (ll i = a; i < b; i++)
// #define debug2(x,y) cout<<"This side ----> "<<#x<<" -> "<<x<<" | "<<#y<<" -> "<<y<<endl;
// #define debug(x) cout<<"This side    ----> "<<#x<<" -> "<<x<<endl
#define all(x) x.begin(), x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int, int>
#define mall map<ll, ll>
// #define ciN cin
// #define gu(a,s) get<a>(s)
#define tin tuple<ll, ll, ll>
#define ter(x, y, z) ((x) ? y : z)
// #define ul ll
int solve()
{
    while (true)
    {
        int m;
        cin >> m;
        int arr[m];
        for (int i = 0; i < m; i++)
        {
            cin >> arr[i];
        }
        int x, y;
        cin >> x >> y;

        int sum = 0, l = 0;
        while (true)
        {
            // cout << "   " << l << endl;
            sum += arr[l];
            if(sum > y){
                break;
            }
            l++;
            if (sum >= x)
            {
                int sum2 = 0;
                for (int q = l; q < m; q++)
                {
                    sum2 += arr[q];
                }
                if (sum2 <= y && sum2 >= x)
                {
                    // cout << (l + 1);
                    if((l+1)<=m)
                        return (l+1);
                    else 
                        return 0;
                }
            }
        }
        // cout << " " << (l + 1) << endl;
    return 0;
    }
}
int main()
{
   cout<<solve();
}