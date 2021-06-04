#include<bits/stdc++.h>
using namespace std;

int main(){

    multiset<pair<long,long>> mull;
    set <pair<long,long>> sll;
    int n,a,b;
    cin>>n;
    for(int i = 0 ; i < n ; i++){
        cin>>a>>b;
        mull.insert(a,b);
        sll.insert(a,b);
    }

    int max = INT_MIN;

    for (set <pair<long,long>>::iterator itr = sll.begin(); itr != sll.end(); ++itr)
    {
        if(mull.count(*itr) > max){
            max = mull.count(*itr);
        }
    }
    cout<<max<<endl;
}
