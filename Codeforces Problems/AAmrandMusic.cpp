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

int main(){
    int n,k;
    cin>>n>>k;
    vp p;
    int temp;
    for(int i = 0 ; i < n ; i++){
        cin>>temp;
        p.pb(mp(temp,i+1));
    }
    sort(all(p));
    // for(int i = 0 ; i < n ; i++){
    //     cout<<p[i].first<<" "<<p[i].second<<endl;
    // }

    int j = 0;
    
    int cn = 0;
    while(true){
        if(k - p[j].first >= 0){
            k = k - p[j].first;
            cn++;
            j++;
        }
        if(j == n || k == 0 || k - p[j].first < 0){
            break;
        }
    }
    cout<<cn<<endl;

    for(int i = 0 ; i < cn ; i++){
        cout<<p[i].second<<" ";
    }
}