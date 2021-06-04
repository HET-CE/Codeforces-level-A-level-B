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

ll sum1 = 0,sum2 = 0, max_sum = INT_MIN, a, b;
void solve(ll arr1[], ll arr2[], ll n){
    for(ll i = 0 ; i < n-1 ; i++){
        for(ll j = i+1 ; j < n ; j++){
            sum1 = 0,sum2 = 0;
            for(ll l = i ; l <= j ; l++){
                sum1 = sum1  | arr1[l];
            }
            for(ll l = i ; l <= j ; l++){
                sum2 = sum2 | arr2[l];
            }
            ll sum = sum1 + sum2;
            if(sum > max_sum){
                max_sum = sum;
                // a = i;
                // b = j;
            }
        }
    }

    cout<<max_sum;
}

int main(){
    ll n;
    cin>>n;
    ll arr1[n];
    ll arr2[n];
    for(ll i = 0 ; i < n ; i++){
        cin>>arr1[i];
    }
    
    for(ll i = 0 ; i < n ; i++){
        cin>>arr2[i];
    }
    if(n==1){
        cout<<((arr1[0] | 0) + (arr2[0] | 0)) ;
    }
    else
        solve(arr1, arr2, n);
}