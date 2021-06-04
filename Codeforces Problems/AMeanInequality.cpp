#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define ld long double
#define vll vector<ll>
#define vi vector<int>
#define vb vector<bool>
#define pi pair<int,int>
#define pll pair<ll,ll>
#define vp vector<pi>
#define vpll vector<pll>
#define pb push_back
#define mp make_pair
#define mt make_tuple
#define F first
#define S second

void solve(){
    int n;
    cin>>n;
    vector<int> a(2*n);
    for(int &x : a){
        cin>>x;
    }
    sort(a.begin(), a.end());
    int f = 0 ;
    int l = 2*n - 1;
    for(int i = 0 ; i < n ; i++){
        cout<<a[f]<<" "<<a[l]<<" ";
        f++;
        l--;
    }
    cout<<"\n";
}
int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}
