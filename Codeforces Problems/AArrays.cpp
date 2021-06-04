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
#define For(i,a,b) for(ll i=a;i<b;i++)
// #define debug2(x,y) cout<<"This side ----> "<<#x<<" -> "<<x<<" | "<<#y<<" -> "<<y<<endl;
// #define debug(x) cout<<"This side    ----> "<<#x<<" -> "<<x<<endl
#define all(x) x.begin(),x.end()
#define rall(x) x.rbegin(), x.rend()
#define mint map<int,int>
#define mall map<ll,ll>
// #define ciN cin
// #define gu(a,s) get<a>(s)
#define tin tuple<ll,ll,ll>
#define ter(x,y,z) ((x)?y:z)
// #define ul ll

int main(){
    int na, nb, k, m, temp;
    cin>>na>>nb>>k>>m;
    vector<int> a(na);
    vector<int> b(nb);
    for(int i = 0 ; i < na ; i++){
        cin>>temp;
        a[i] = temp;
    }
    for(int i = 0 ; i < nb ; i++){
        cin>>temp;
        b[i] = temp;
    }
    
    if(a[k-1] < b[nb-m]){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
}