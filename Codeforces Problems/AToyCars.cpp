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
    bool flag = true;
    int n,temp; 
    cin>>n;
    int arr[n][n];
    vector<int> v;
    for(int i = 0 ; i < n ; i++){
        flag = true;
        for(int j = 0 ; j < n ; j++){
            cin>>arr[i][j];
            temp = i+1;
            if(arr[i][j] == 1 || arr[i][j] == 3){
                flag = false;
            }
        }
        if(flag == true){
            v.pb(temp);
        }
    }

    cout<<v.size()<<endl;
    for(int i = 0 ; i< v.size() ; i++){
        cout<<v[i]<<" ";
    }
}