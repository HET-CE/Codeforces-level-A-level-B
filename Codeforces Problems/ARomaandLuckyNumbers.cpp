#include<bits/stdc++.h>
using namespace std;

int res = 0;
void solve(int k){
    int num;
    cin>>num;
    string s = to_string(num);
    for(int i = 0 ; i < s.size() ; i++){
        if(s.at(i) == '4' || s.at(i) == '7'){
            k--;
        }
        if(k == -1){
            return;
        }
    }
    res++;
}

int main(){
    int n,k;
    cin>>n>>k;
    while(n--){
        solve(k);
    }
    cout<<res;
}