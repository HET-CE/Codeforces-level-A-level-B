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

int main(){
    int n;
    cin>>n;
    int minEle = INT_MAX ,maxEle = INT_MIN ,minIndex = 0,maxIndex = 0;
    vi v;
    int temp;
    for(int i = 0 ; i < n ; i++){
        cin>>temp;
        if(temp < minEle){
            minEle = temp;
            minIndex = i;
        }
        if(temp > maxEle){
            maxEle = temp;
            maxIndex = i;
        }
        v.pb(temp);
    }

    if((minIndex == 0 && maxIndex == n-1) || (minIndex == n-1 && maxIndex == 0)){
        cout<<(n-1);
    }
    else if((minIndex == 0 && maxIndex != n-1) || (maxIndex == 0 && minIndex != n-1))
        cout<<(n-1);
    else{
        if(minIndex < maxIndex){
            if(maxIndex > n-1-minIndex){
                cout<<maxIndex;
            }
            else{
                cout<<(n-1-minIndex);
            }
        }
        else{
            if(minIndex > n-1-maxIndex){
                cout<<minIndex;
            }
            else{
                cout<<(n-1-maxIndex);
            }
        }
    }
}