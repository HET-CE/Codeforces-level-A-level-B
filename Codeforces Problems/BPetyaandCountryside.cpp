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


int solve(int arr[], int n, int temp){
    
    int seq = 1,long_seq = INT_MIN;
    for(int i = temp ; i < n-1 ; i++){
        seq = 1;
        if(arr[i+1] >= arr[i]){
            while(arr[i+1] >= arr[i]){
                seq++;
                i++;
                if(seq == n){
                    cout<<i<<endl;
                    return seq;
                }
                cout<<" "<<seq;
            }
            while(arr[i+1] <= arr[i]){
                seq++;
                i++;
                if(seq == n){
                    cout<<i;
                    return seq;
                }
                cout<<"  "<<seq;
            }
            if(seq > long_seq)
                long_seq = seq;
            seq = 1;
        }
        if(arr[i+1] < arr[i]){
            while(arr[i+1] < arr[i]){
                seq++;
                i++;
                if(seq == n ){
                    return seq;
                }
                cout<<"   "<<seq;
            }
            if(seq > long_seq){
                long_seq = seq;
            }
        }
    }
    cout<<"       "<<long_seq<<endl;
    return long_seq;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0 ; i < n ; i++){
        cin>>arr[i];
    }
    int res = INT_MIN,ans;
    for(int i = 0 ; i < n ; i++){
        ans = solve(arr, n,arr[i]);
        if(ans > res){
            res = ans;
        }
    }
    cout<<res;
}